/*
Создать коллекцию типизированную Number
Положить в нее Integer, Number и Object
(все что запрещено - закомментировать и поставить метку ERROR)

Создать коллекцию типизированную ? extends Number
Положить в нее Integer, Number и Object

Создать коллекцию типизированную ? super Number
Положить в нее Integer, Number и Object
*/

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Object object = new Object();
        Number number = null;
        Integer integer = 5;

        Collection<Number> listNum = new ArrayList<>();
//        listNum.add(object);  //ERROR
        listNum.add(integer);
        listNum.add(number);

        Collection<? extends Number> listExt = new ArrayList<>();
//        listExt.add(object);   //ERROR
//        listExt.add(integer);  //ERROR
//        listExt.add(number);   //ERROR

        Collection<? super Number> listSup = new ArrayList<>();
//        listSup.add(object);   //ERROR
        listSup.add(integer);
        listSup.add(number);
    }
}

/*
Создать коллекцию с ? extends Number и
и передать в конструктор один или несколько массивов разных типов (Integer, Number и Object).


Создать коллекцию с ? super Number и
и передать в конструктор один или несколько массивов разных типов (Integer, Number и Object).
*/
class Task2 {

    Collection<? extends Number> listExt = new ArrayList<>();
    Collection<? super Number> listSup = new ArrayList<>();

    public Task2(Integer[] integer, Number[] number, Object[] object) {

    }

}
/*
Создать статический метод принимающий коллекцию List<Number>
вызвать метод из main и передать в него коллекцию
ArrayList<Number>, ArrayList<Integer>, ArrayList<Object>

Создать статический метод принимающий коллекцию List<? extends Number>
вызвать метод из main и передать в него коллекцию
ArrayList<Number>, ArrayList<Integer>, ArrayList<Object>

Создать статический метод принимающий коллекцию List<? super Number>
вызвать метод из main и передать в него коллекцию
ArrayList<Number>, ArrayList<Integer>, ArrayList<Object>


Получить элемент переданной в метод коллекции и вывести на консоль тип через getClass.getSimpleName()*/
class Task3 {
    public static void getListNum(List<Number> listNam) {

    }
    public static void getListExt(List<? extends Number> listExt) {

    }
    public static void getListSup(List<? super Number> listSup) {

    }

    public static void main(String[] args) {
        ArrayList<Number> listNum = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Object> listObj = new ArrayList<>();

        getListNum(listNum);
//        getListNum(listInt); //ERROR
//        getListNum(listObj); //ERROR

        getListExt(listNum);
        getListExt(listInt);
//        getListExt(listObj);  //ERROR

        getListSup(listNum);
//        getListSup(listInt);  //ERROR
        getListSup(listObj);


    }

}

/*TASK 4
 *
 * инвариантность
 * List<X> will not be subType of List<Y>.
 *
 *
 * String[] is subtype of Object[]
 * таким образом, массивы называются ковариантными.
 *
 * */
