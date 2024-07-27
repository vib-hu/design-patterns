package behavioral.templatemethod.comparable;

public class Sort {

    public void sort(Object[] arr){
        Object[] newArr =arr;// arr.clone();
        for(int i=0;i<arr.length;i++){
            int min =i;
            for(int j=i;j<arr.length;j++){
                Comparable SecondItem = (Comparable)newArr[j];
                if(((Comparable)newArr[min]).compareTo(SecondItem)>0){
                    min = j;
                }
            }
            swap(newArr, i, min);
        }
    }

    private void swap(Object[] arr, int first, int second){
        Object temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
