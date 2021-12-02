package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<FamilyMember> familyMembers;

    public Family(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void addFamilyMember(FamilyMember familyMember){
        familyMembers.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name){
        List<Integer> results = new ArrayList<>();
        for (FamilyMember f: familyMembers){
            if (f.getName().contains(name)){
                results.add(f.getAge());
            }
        }
        return results;
    }

}
