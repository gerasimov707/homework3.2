package compass.homework_3_2.service;

import compass.homework_3_2.exception.DivideByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Number plus(Integer a, Integer b){
        return a+b;
    }

    public Number minus(Integer a, Integer b){
        return a-b;
    }

    public Number multiply(Integer a, Integer b){
        return a*b;
    }

    public Number divide(Integer a, Integer b){
        if (b==0){
            throw new DivideByZeroException("делить на 0 нельзя!");
        }
        return a.doubleValue()/b;

    }

}
