package com.kodilla.testing.library;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselid;

    public LibraryUser(String firstname, String lastname, String peselid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselid = peselid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselid() {
        return peselid;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselid='" + peselid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;

        LibraryUser that = (LibraryUser) o;

        if (!getFirstname().equals(that.getFirstname())) return false;
        if (!getLastname().equals(that.getLastname())) return false;
        return getPeselid().equals(that.getPeselid());
    }

    @Override
    public int hashCode() {
        int result = getFirstname().hashCode();
        result = 31 * result + getLastname().hashCode();
        result = 31 * result + getPeselid().hashCode();
        return result;
    }
}
