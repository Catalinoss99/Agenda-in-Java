
package agenda;

import java.time.LocalDate;
import java.util.*;

class ContactComparatorId implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
        return (c1.getId() - c2.getId());
    }
}

class ContactComparatorFirstname implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
       return c1.getFirstname().compareTo(c2.getFirstname());
    }
}

class ContactComparatorLastname implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
       return c1.getLastname().compareTo(c2.getLastname());
    }
}

class ContactComparatorBirthdate implements Comparator<Contact> {
    @Override
    public int compare(Contact c1, Contact c2) {
       return c1.getBirthdate().compareTo(c2.getBirthdate());
    }
}

// Singleton Design Pattern
public class Agenda {
    private int maxId;
    private boolean changed;
    private boolean activated = false;
    
    private static Agenda instance = new Agenda();
    private List<Contact> lcontacts = null;

    //make the constructor private so that this class cannot be instantiated
    private Agenda() {
        lcontacts = new ArrayList();
    }
    
    public Vector<String> getBirthdateToday() {
        Vector<String> vec = new Vector();
        LocalDate ld = LocalDate.now();
        int cmonth = ld.getMonthValue();
        int cday = ld.getDayOfMonth();
        for (Contact c : lcontacts) {
            String birthdate = c.getBirthdate();
            String smonth = birthdate.substring(5, 7);
            String sday = birthdate.substring(8, 10);
            int imonth = Integer.parseInt(smonth);
            int iday = Integer.parseInt(sday);
            if (imonth == cmonth && iday == cday) {
                vec.add(c.toString());
            }
        }
        return vec;
    }
    
    // Algoritm de generare cod de licenta
    //    QWERTYUIOPASDFGH
    //    160185527462952525
    //    Cel mai mare ZZZZZZZZZZZZZZZZ
    //    622441180299687323
    //    Cel mai mic 0000000000000000
    //    3217945563889925
    public long generareCodLicenta(String ac){
        long cl = 0;
        char ch;
        for (int i=0; i< ac.length(); i++){
            ch = ac.charAt(i);
            int m1 = (i % 5);
            int m2 = (ch % 7);
            switch (m1){
                case 0:
                    ch += m2 + 1;
                    break;
                    
                case 1:
                    ch += m2 - 3;
                    break;
                    
                case 2:
                    ch += m2 - 4;
                    break;
                    
                case 3:
                    ch += m2 - 1;
                    break;
                    
                case 4:
                    ch += m2 - 2;
                    break;
            }
            if (i%2 == 0)
                cl += ch;
            else
                cl *= ch;
        }
        return cl;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }
    
    public boolean addContact(Contact c) {
        lcontacts.add(c);
        return true;
    }
    
    public List<Contact> getContacts(){
        List<Contact> lc = new ArrayList<Contact>();
        for (Contact c : lcontacts){
            lc.add(c);
        }
        lc.sort(new ContactComparatorId());
        return lc;
    }
    
    public Contact getContact(int id){
        int i = 0;
        for (i=0; i< lcontacts.size(); i++){
            if (id == lcontacts.get(i).getId()){
                break;
            }
        }
        if (i < lcontacts.size()){
            return lcontacts.get(i);
        }
        return null;
    }
    
    public boolean remove(int id) {
        int i = 0;
        for (i=0; i< lcontacts.size(); i++){
            if (id == lcontacts.get(i).getId()){
                break;
            }
        }
        if (i < lcontacts.size()){
            lcontacts.remove(i);
            return true;
        }
        return false;
    }
    
    public void clear() {
        lcontacts.clear();
    }

    //Get the only object available
    public static Agenda getInstance() {
        return instance;
    }
    
    public void sortare(Ordonare ordonare) {
        switch(ordonare){
            case DUPA_NIMIC:
                lcontacts.sort(new ContactComparatorId());
                break;
            
            case DUPA_NUME:
                lcontacts.sort(new ContactComparatorLastname());
                break;
                
            case DUPA_PRENUME:
                lcontacts.sort(new ContactComparatorFirstname());
                break;
                
            case DUPA_DATA_NASTERE:
                lcontacts.sort(new ContactComparatorBirthdate());
                break;
        }
    }
    
    public Vector<String> getStringData(){
        Vector<String> vecdata = new Vector();
        for (Contact c : lcontacts){
            vecdata.add(c.toString());
        }
        return vecdata;
    }
    
    public int getMaxId() {
        return maxId;
    }

    public void setMaxId(int maxId) {
        this.maxId = maxId;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public boolean isChanged() {
        return changed;
    }
    
    public Vector<String> filtrareFixa(FixedFilters ff) {
        if (ff == FixedFilters.NIMIC)
            return getStringData();
        Vector<String> vecdata = new Vector();
        switch(ff){
            case TELEFON_FIX:
                for (Contact c : lcontacts){
                    if (c.getMob_fix().equals("F")){
                        vecdata.add(c.toString());
                    }
                }
                break;
                
            case TELEFON_MOBIL:
                for (Contact c : lcontacts){
                    if (c.getMob_fix().equals("M")){
                        vecdata.add(c.toString());
                    }
                }
                break;
                
            case ZIUA_NASTERE: {
                vecdata = getBirthdateToday();
                break;
            }
            
            case LUNA_NASTERE: {
                LocalDate ld = LocalDate.now();
                int cmonth = ld.getMonthValue();
                int cday = ld.getDayOfMonth();
                for (Contact c : lcontacts){
                    String birthdate = c.getBirthdate();
                    String smonth = birthdate.substring(5, 7);
                    String sday = birthdate.substring(8, 10);
                    int imonth = Integer.parseInt(smonth);
                    int iday = Integer.parseInt(sday);
                    if (imonth == cmonth && iday > cday){
                        vecdata.add(c.toString());
                    }
                }
                break;
            }
        }
        return vecdata;
    }
    
    public Vector<String> filtrareUtilizator(String sfilter) {
        Vector<String> vecdata = new Vector();
        for (Contact c : lcontacts) {
            if (c.getFirstname().indexOf(sfilter) >= 0 ||
                c.getLastname().indexOf(sfilter) >= 0 || 
                c.getPhoneno().indexOf(sfilter) >= 0) {
                vecdata.add(c.toString());
            }
        }
        return vecdata;
    }
}

