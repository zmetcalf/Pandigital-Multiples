public class PandigitalMultiples 
{
    private int highestPandigital = 0;
    
    public PandigitalMultiples() {
    }
    
    public void findAndPrintHighestPandigital() {
        int counter = 1;
        int product;
        String checkString = "";
        boolean findPandFlag = true;
        
        for(int i = 2; i < 10000; i++) {
            while(findPandFlag) {
                product = i * counter;
                checkString = checkString + Integer.toString(product);
                if(checkString.length() > 9) {
                    break;
                }
                else if(checkString.length() == 9) {
                    if(checkPandigital(checkString)) {
                        if(Integer.valueOf(checkString) > highestPandigital) {
                            highestPandigital = Integer.valueOf(checkString);
                        }
                        break;
                    }
                    else {
                        break;
                    }
                }
                counter++;
            }
            counter = 1;
            checkString = "";
        }
        System.out.printf("The highest pandigital is %d.\n", highestPandigital);
    }
    
    private boolean checkPandigital(String checkPan) {
        
        if(checkPan.length() != 9) {
            return false;
        }
        
        for(int i = 1; i <= 9; i++) {
            if(checkPan.contains(Integer.toString(i)) == false) {
                return false;
            }
        }
        return true;
    }
}