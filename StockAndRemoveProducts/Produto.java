package Section8pt2;

public class Produto {

    public String name;
    public float qtdEstoque;
    public float price;


    public float TotalValueInStock(){
        return price * qtdEstoque;

    }

    public float AddItemInStock(int quantity){
        this.qtdEstoque = this.qtdEstoque + quantity;
        return this.qtdEstoque;
    }

    public float RemoveItemInStock(int quantity){
        this.qtdEstoque = this.qtdEstoque - quantity;
        return this.qtdEstoque;
    }

    public String toString(){
        return name+", $ "+price+", "+qtdEstoque+" units, Total: $ "+TotalValueInStock();
    }
}
