package tumpukan;

public class node {
    protected Integer dataNode; // Data dalam tumpukan.node
    protected node ptr;         // Pointer ke tumpukan.node selanjutnya

    public node() {
        dataNode = null;
        ptr = null;
    }

    public node(Integer d, node e) {
        dataNode = d;
        ptr = e;
    }

    public void setData(Integer d) {
        dataNode = d;
    }

    public void setPtg(node e) {
        ptr = e;
    }

    public Object getData() {
        return dataNode;
    }

    public node getPtr() {
        return ptr;
    }
}