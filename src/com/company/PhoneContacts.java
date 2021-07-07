package com.company;

public class PhoneContacts {
    String Group;

    public PhoneContacts(String group) {
        Group = group;
    }
    public PhoneContacts() {

    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneContacts that = (PhoneContacts) o;

        return Group != null ? Group.equals(that.Group) : that.Group == null;
    }

    @Override
    public int hashCode() {
        return Group != null ? Group.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nГруппы: " + Group;
    }
}
