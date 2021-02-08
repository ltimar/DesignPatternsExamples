package Test2_V6_AbstractFactorySmoothieParametrizat;

public class FabricaDeFructe {
      public Fruit oferaFruct(FruitEnum numeFruct) throws Exception{
            switch (numeFruct){
                  case STRAWBERRY : return new Strawberry();
                  case KIWI : return new Kiwi();
                  default: throw new Exception();
            }
      }

//      public Fruit oferaFruct(String numeFruct) throws Exception{
//            switch (numeFruct){
//                  case "strawberry" : return new Strawberry();
//                  case "kiwi" : return new Kiwi();
//                  default: throw new Exception();
//            }
//      }
}
