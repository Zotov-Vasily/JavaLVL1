package FinalProject;

public class Board {
    private Ships [][] shipArray;

    public Board(Ships[][] shipArray) {
        this.shipArray = shipArray;
    }

    public Ships[][] getShipArray() {
        return shipArray;
    }

    public void setShipArray(Ships[][] shipArray) {
        this.shipArray = shipArray;
    }
    public void print(){
        for (int x = 0; x < shipArray.length; x++){
            for (int y = 0; y < shipArray[x].length; y++){
                System.out.print(shipArray[x][y]);
            }
            System.out.println();
        }
    }
}
