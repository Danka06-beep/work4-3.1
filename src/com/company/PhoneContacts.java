package com.company;

public class PhoneContacts {
    String group;

    public PhoneContacts(String group) {
        this.group = group;
    }
    public PhoneContacts() {

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneContacts that = (PhoneContacts) o;

        return group != null ? group.equals(that.group) : that.group == null;
    }

    @Override
    public int hashCode() {
        return group != null ? group.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "\nГруппы: " + group;
    }
}
