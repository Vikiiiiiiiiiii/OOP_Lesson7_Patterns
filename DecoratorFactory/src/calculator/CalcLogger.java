package calculator;

public class CalcLogger implements Calculable{

    private Calculable calculable;
    private Loggable logable;

    public CalcLogger(Calculable calculable, Loggable loggable){
        this.calculable = calculable;
        this.logable = loggable;
        logable.log(String.format("Число %d \n", calculable.getResult()));
    }

    @Override
    public Calculable sum(int arg){
        logable.log(String.format("Прибавляем %d \n", arg));
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg){
        logable.log(String.format("Умножаем на %d \n", arg));
        return calculable.multi(arg);
    }

    @Override
    public int getResult(){
        int res = calculable.getResult();
        logable.log(String.format("Получили результат: %d \n", res));
        return res;
    }
}
