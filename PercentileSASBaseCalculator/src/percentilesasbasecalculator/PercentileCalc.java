/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentilesasbasecalculator;

/**
 *
 * @author ATsaloukidis
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATsaloukidis
 */
public class PercentileCalc {
    
    private int algorithmType  = 5;

    public PercentileCalc(int algorithmType) {
        this.algorithmType = algorithmType;
    }

    public PercentileCalc() {
    }

    public void setAlgorithmType(int algorithmType) {
        this.algorithmType = algorithmType;
    }

    public int getAlgorithmType() {
        return algorithmType;
    }
    

    
    public double SimplePercnetile(List<Double> inputList, double percentile){
        
      
       Collections.sort(inputList);
      
       
       int j = 1;
       boolean percentileFound = false;
       double valueOfPercentile = 0;
       
       if (algorithmType == 5){
           
       
        do{
           
          if (percentile == 1) {
            valueOfPercentile = inputList.get(inputList.size()-1);
            percentileFound = true;
          } 
          
          else if (percentile == 0) {
            valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(0) + ((inputList.size() * percentile - j))*inputList.get(0);
            percentileFound = true;
          }
          
          else if ((double)j / inputList.size() == percentile) {
              valueOfPercentile = (inputList.get(j - 1) + inputList.get(j))/2;
              percentileFound = true;
          }
          
          else if ( (inputList.size() * percentile - j) > 0 && (inputList.size() * percentile - j) < 1) {
              valueOfPercentile = inputList.get(j);
              percentileFound = true;
          }
          
          else ++j;
              
        } while (percentileFound == false);
       }
       
       else if (algorithmType == 4){
           
           do{
               
          
             if (percentile == 0) {
              valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(0) + ((inputList.size() * percentile - j))*inputList.get(0);
              percentileFound = true;
            }
             
             else if ( ((inputList.size() + 1) * percentile - j) >= 0 && ((inputList.size() + 1) * percentile - j) < 1) {
              if (percentile < 1 ) valueOfPercentile = (1 - (((inputList.size() + 1) * percentile - j)) )*inputList.get(j - 1) + (((inputList.size() + 1) * percentile - j))*inputList.get(j);
              else valueOfPercentile = (1 - (((inputList.size() + 1) * percentile - j)) )*inputList.get(inputList.size()-1) + (((inputList.size() + 1) * percentile - j))*inputList.get(inputList.size()-1);
              percentileFound = true;
            }
             
            ++j;
            
           } while (percentileFound == false);
       }
       
       else if (algorithmType == 3){
           
        do{   
            
          if (percentile == 1) {
            valueOfPercentile = inputList.get(inputList.size()-1);
            percentileFound = true;
          } 
          
          else if (percentile == 0) {
            valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(0) + ((inputList.size() * percentile - j))*inputList.get(0);
            percentileFound = true;
          }
          
          else if ((double)j / inputList.size() == percentile) {
              valueOfPercentile = inputList.get(j - 1) ;
              percentileFound = true;
          }
          
          else if ( (inputList.size() * percentile - j) > 0 && (inputList.size() * percentile - j) < 1) {
              valueOfPercentile = inputList.get(j);
              percentileFound = true;
          }
          
           else ++j;
          
          
        } while (percentileFound == false);   
          
       }
       
       else if (algorithmType == 2){
         
        do{
            
          if (percentile == 1) {
            valueOfPercentile = inputList.get(inputList.size()-1);
            percentileFound = true;
          } 
          
          else if (percentile == 0) {
            valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(0) + ((inputList.size() * percentile - j))*inputList.get(0);
            percentileFound = true;
          }
          
          else if ( (inputList.size() * percentile - j) >= 0 && (inputList.size() * percentile - j) < 0.5) {
              valueOfPercentile = inputList.get(j - 1);
              percentileFound = true;
          }
       
          else if ( (inputList.size() * percentile - j) == 0.5 && j%2 == 0) {
              valueOfPercentile = inputList.get(j - 1);
              percentileFound = true;
          }  
          
          else if ( (inputList.size() * percentile - j) == 0.5 && j%2 == 1) {
              valueOfPercentile = inputList.get(j);
              percentileFound = true;
          }  
          
         else if ( (inputList.size() * percentile - j) < 1 && (inputList.size() * percentile - j) > 0.5) {
              valueOfPercentile = inputList.get(j);
              percentileFound = true;
          }
          
         else ++j;
          
        } while (percentileFound == false); 
          
           
       }
       
       else if (algorithmType == 1){
           
           do{
               
            if (percentile == 1) {
            valueOfPercentile = inputList.get(inputList.size()-1);
            percentileFound = true;
            } 
            
            else if (percentile == 0) {
            valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(0) + ((inputList.size() * percentile - j))*inputList.get(0);
            percentileFound = true;
            } 
            
            else if ( (inputList.size() * percentile - j) >= 0 && (inputList.size() * percentile - j) < 1) {
              valueOfPercentile = (1 - ((inputList.size() * percentile - j)) )*inputList.get(j - 1) + ((inputList.size() * percentile - j))*inputList.get(j);
              percentileFound = true;
            }
            
            else ++j;
           } while (percentileFound == false); 
       }
     return valueOfPercentile;   
 
    }
    
    
}
