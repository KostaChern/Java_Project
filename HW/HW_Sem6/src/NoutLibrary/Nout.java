package NoutLibrary;
  
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;


// Подумать над структурой класса Ноутбук(или Единорогов) для магазина техники - выделить поля и методы. 
// Реализовать в java.
// Создать множество ноутбуков.
// Переопределить toString, equals и hashCode(как на семинаре).
// Вывести на печать экземпляры класса, сравнить пару экземпляров и найти один экземпляр в наборе.
public class Nout {
   
    public String model;
    public String contry;
    public int diagonal;
    public String cpu;
    public int ram;
    public String graphcontroller;
    // public Date productionDate;
    public int color;
    public int weight;
    public boolean fingerprintsensor; 
    public long id;

    public Nout(String model, String contry, int diagonal, String cpu, int ram, String graphcontroller, int color, int weight, boolean fingerprintsensor, long id) {
        this.model = model;
        this.contry = contry;
        this.diagonal = diagonal;
        this.cpu = cpu;
        this.ram = ram;
        this.graphcontroller = graphcontroller;
        this.weight = weight;
        this.color = color;
        this.fingerprintsensor = fingerprintsensor;
        this.id = id;
    }

    public boolean medSup()
    {
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        // TODO Auto-generated method stub
        return "Ноутбук: "+model+"Страна производитель: "+contry+"Диагональ (дюймы): "+diagonal+"; "+ "Процессор: "+cpu+ "Оперативная память (Гб): " +ram+"; "+ "Графический контроллер: " + graphcontroller +
        "Вес (гр).:"+weight+"; "+"Цвет: "+color+ "; "+"Сенсор отпечатка пальца: "+fingerprintsensor+"; "+"ID: "+id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nout nout = (Nout) o;
        return weight == nout.weight && color == nout.color && fingerprintsensor == nout.fingerprintsensor ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonal, ram, color, weight, id);
    }

}
