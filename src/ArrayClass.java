public class ArrayClass {
    int []arr;
    int nElements;
    public ArrayClass(int size){
        arr=new int[size];
        nElements=0;
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void insert(int data){

        arr[nElements++]=data;
    }
    public void shellShort(){
        int inner,outer;
        int temp;
        int h=1;
        while(h<=nElements/3){
            h=h*3+1;
        }
        while(h>0){
            for(outer=h;outer<nElements;outer++){
                temp=arr[outer];
                inner=outer;
                while(inner>h-1 && arr[inner-h]>=temp){
                    arr[inner]=arr[inner-h];
                    inner-=h;
                }
                arr[inner]=temp;
            }
            h=(h-1)/3;
        }
    }

}
