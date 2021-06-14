
import java.util.*;

public class TrashCollection<trashTypes> {
    String[] trashTypes = {"tissue paper or napkins", "paper plates", "printer paper", "cigarette box",
            "q-tips", "paper takeaway cups/boxes", "| cardboard box", "egg carton",
            "| takeaway containers/cup/microwavable food tray", "plastic bottles",
            "plastic container such as peanut butter/cooking oil/handsoap/window cleaner", "| plastic toys",
            "shampoo/conditioner/detergent bottle/motor oil container/chemical container",
            "other cosmetics containers", "grocery bag", "cereal box liner/other food liners",
            "reusable water bottle", "milk jug 17", "| protective clothing (biohazard gear/beekeeper suit)",
            "shower curtain", "tent", "bandage", "| 22 juice box", "tupperware type containers",
            "ziploc baggy", "saran or other plastic wrap/bubble wrap", "wrapping paper",
            "plastic bag from amazon or other delivery service", "|28 bottle cap", "chips bag", "plastic straw",
            "plastic toothbrush or hairbrush", "diapers", "sanitary pads or tampons", "plastic tags",
            "plastic razor handle or other handled device", "| 36styrofoam", "packing peanuts", "|38 balloon",
            "condom", "| 40cotton clothing", "cotton balls", "wool clothing", "silk clothing", "linen or hemp clothing",
            "polyester clothing", "nylon", "viscose or rayon clothing", "| 48leather", "| 49yard waste", "| 50wood",
            "| 51glass", "| 52ashes", "| 53electronics", "| 54metal", "aluminum cans", "tin cans", "aerosol cans",
            "metal bottle caps", "aluminum foil", "lighters", "| 61receipts", "batteries",
            "lightbulbs", "oil", "pesticides", "|66 tires", "rubber shoes", "rubber pet toys", "rubber bands", "gum", "erasers",
            "elastic material (such as in hairties or pants)"};
    String[] wasteTypes = {"paper", "cardboard", "PET plastics", "HDPE plastics", "PVC plastics", "LDPE plastics",
            "PP plastics", "polystrynene", "latex", "textiles", "leather", "yard waste", "wood", "glass", "metal",
            "chemical waste", "ashes", "electronics", "rubber"};

    public static void main(String[] args) {
        TrashCollection trashCollection = new TrashCollection();
        ArrayList<String> userTrash = new ArrayList<>();
        boolean addSomething = true;
        int userNum = trashCollection.mapWaste(trashCollection.getUserInput(addSomething));
        String wasteCount = trashCollection.getWastetype(userNum);
        System.out.println(wasteCount);
        trashCollection.createUserfile(userTrash);

    }

    //gets user input
    public static String getUserInput(boolean addSomething) {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        while (addSomething = true) {
            System.out.println("Do you want to add something?");
            userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                addSomething = true;
                System.out.println("What do you want to add?");
                String userInfo = scanner.nextLine();
                userInput = userInfo;
            }
            else {
                userAnswer = "no";
                addSomething = false;
                break;
            }
        }
        return userInput;
    }

    //maps user input to trash type in order to get waste type below
    public int mapWaste(String userInput) {
        int userNum = 0;
        for (int i = 0; i < trashTypes.length; i++) {
            if (trashTypes[i].equals(userInput)) {
                userNum = i;
            }
        }
        return userNum;
    }

    //finds what waste the trash type maps to, counts instances of that waste
    public String getWastetype(int userNum) {
        String wasteType = "";
        int PPnum = 0;
        int HDPEnum = 0;
        int LDPEnum = 0;
        int PETnum = 0;
        int rubberNum = 0;
        int paperNum = 0;
        int cardNum = 0;
        int polyNum = 0;
        int ashNum = 0;
        int electronNum = 0;
        int metalNum = 0;
        int woodNum = 0;
        int glassNum = 0;
        int latexNum = 0;
        int PVCnum = 0;
        int chemNum = 0;
        int textileNum = 0;
        int leatherNum = 0;
        int yardNum = 0;
        if (userNum < 6) {
            paperNum++;
            wasteType = paperNum + " paper";
        }
        else if (userNum >= 6 && userNum < 8) {
            cardNum++;
            wasteType = cardNum + " cardboard";
        }
        else if (userNum >= 8 && userNum < 11) {
            PETnum++;
            wasteType = PETnum + " PET plastics";
        }
        else if (userNum >= 11 && userNum < 18) {
            HDPEnum++;
            wasteType = HDPEnum + " HDPE plastics";
        }
        else if (userNum >= 18 && userNum < 22) {
            PVCnum++;
            wasteType = PVCnum +  " PVC plastics";
        }
        else if (userNum >= 22 && userNum < 28) {
            LDPEnum++;
            wasteType = LDPEnum + " LDPE plastics";
        }
        else if (userNum >= 28 && userNum < 36) {
            PPnum++;
            wasteType = PPnum + " PP plastics";
        }
        else if (userNum >= 36 && userNum < 38) {
            polyNum++;
            wasteType = polyNum + " polystrynene";
        }
        else if (userNum >= 38 && userNum < 40) {
            latexNum++;
            wasteType = latexNum + " latex";
        }
        else if (userNum >= 40 && userNum < 48) {
            textileNum++;
            wasteType = textileNum + " textiles";
        }
        else if (userNum == 48) {
            leatherNum++;
            wasteType = leatherNum + " leather";
        }
        else if (userNum == 49) {
            yardNum++;
            wasteType = yardNum + " yard waste";
        }
        else if (userNum == 50) {
            woodNum++;
            wasteType = woodNum + " wood";
        }
        else if (userNum == 51) {
            glassNum++;
            wasteType = glassNum + " glass";
        }
        else if (userNum == 52) {
            ashNum++;
            wasteType = ashNum + " ashes";
        }
        else if (userNum == 53) {
            electronNum++;
            wasteType = electronNum + " electronics";
        }
        else if (userNum >= 54 && userNum < 61) {
            metalNum++;
            wasteType = metalNum + " metal";
        }
        else if (userNum >= 61 && userNum < 66) {
            chemNum++;
            wasteType = chemNum + " chemical waste";
        }
        else if (userNum > 66) {
            rubberNum++;
            wasteType = rubberNum + " rubber";
        }
        return wasteType;
    }

    //adds basic user trashtypes to array list
    public void createUserfile(ArrayList<String> userTrash) {
        boolean addSomething = true;
        String userInput = getUserInput(addSomething);
        userTrash.add(userInput);
        System.out.println(userTrash.toString());
    }

}
