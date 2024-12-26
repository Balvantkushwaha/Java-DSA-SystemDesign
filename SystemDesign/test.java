
public class test {
    public static void main(String[] args) {
          Jalebi jalebi1 = Jalebi.getJalebi();
          System.out.println(jalebi1.hashCode());

          Jalebi jalebi2 = Jalebi.getJalebi();
          System.out.println(jalebi2.hashCode());
    }
}
