package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem){
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int page) {
        if (page <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        double allPages = 0;
        int numberOfPrintedItems = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                for (Feature feature : catalogItem.getFeatures()) {
                    if (feature instanceof PrintedFeatures && ((PrintedFeatures) feature).getNumberOfPages() > page) {
                        allPages += ((PrintedFeatures) feature).getNumberOfPages();
                        numberOfPrintedItems++;
                    }
                }
            }
        }
        if (numberOfPrintedItems == 0) {
            throw new IllegalArgumentException("No page");
        }
        return allPages / numberOfPrintedItems;
    }

    public void deleteItemByRegistrationNumber(String regNum) {
        List<CatalogItem> itemsToDel = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(regNum)) {
                itemsToDel.add(catalogItem);
            }
        }
        catalogItems.removeAll(itemsToDel);
    }

    public int getAllPageNumber() {
        int pages = 0;
        for (CatalogItem catalogItem : catalogItems) {
            pages += catalogItem.numberOfPagesAtOneItem();
        }
        return pages;
    }
    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audio = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audio.add(catalogItem);
            }
        }
        return audio;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem c : catalogItems) {
            result += c.fullLengthAtOneItem();
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }
        return result;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> result = new ArrayList<>();
        for(CatalogItem c: catalogItems){
            for(Feature f: c.getFeatures()){
                if(searchCriteria.hasTitle() && f.getTitle().equals(searchCriteria.getTitle())){
                    result.add(c);
                }
                else if(searchCriteria.hasContributor()){
                    for(String s: f.getContributors()){
                        if(s.equals(searchCriteria.getContributor())){
                            result.add(c);
                        }
                    }
                }
            }
        }

        return result;
    }

}
