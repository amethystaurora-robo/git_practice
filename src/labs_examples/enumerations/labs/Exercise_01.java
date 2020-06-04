package labs_examples.enumerations.labs;

import com.sun.deploy.xml.GeneralEntity;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

enum RichardDawkinsBooks {
    THEBLINDWATCHMAKER("NA"),
    THESELFISHGENE("8"),
    THEMAGICOFREALITY("5"),
    THEGREATESTSHOWONEARTH("10"),
    THEANCESTORSTALE("10"),
    THEEXTENDEDPHENOTYPE("NA"),
    RIVEROUTOFEDEN("NA"),
    THEDEVILSCHAPLAIN("NA"),
    CLIMBINGMOUNTIMPROBABLE("NA");

    private final String rank;
    RichardDawkinsBooks(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}

class GetRanking {
    public static void main(String[] args) {
        RichardDawkinsBooks richardDawkinsBooks = RichardDawkinsBooks.CLIMBINGMOUNTIMPROBABLE;
        System.out.println(richardDawkinsBooks);
    }
}

