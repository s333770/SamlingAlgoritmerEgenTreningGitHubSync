import java.util.Arrays;

public class Algoritmer {



    public static void quickSort(int arr[], int begin,int end){
        if(begin<end){
            int partitionIndex=partition(arr,begin,end);
            quickSort(arr,begin,partitionIndex-1);
            quickSort(arr,partitionIndex+1,end);
        }

    }
    public static int partition(int arr[],int begin,int end){
        int pivot=arr[end];
        int i=(begin-1); //gjør at i og j ikke begynner på samme plass
        for(int j=begin; j<end;j++){

            if(arr[j]<=pivot){
                i++;
                int swapTemp=arr[i];
                arr[i]=arr[j];
                arr[j]=swapTemp;

            }

        }
        int swapTemp=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=swapTemp;

        return i+1;//Returnerer verdien der pivot nå ligger
    }

    public static int binarySearch(int [] sortedArray, int key, int low, int high){
        int index=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(int)(low+high)/2;
            System.out.println(mid);
            if(sortedArray[mid]<key){
                low=mid+1;
            }
            else if(sortedArray[mid]>key){
                high=mid-1;
            }
            else if(sortedArray[mid]==key){
                index=mid;
                break;
            }
        }
        System.out.println();
        System.out.println(index);
        return index;
    }

    //Prøver oss også på en rekursiv funksjon

}
//https://www.geeksforgeeks.org/quick-sort/
