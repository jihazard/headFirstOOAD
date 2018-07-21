package subWay;

import java.io.File;
import java.io.IOException;

public class LoadTest {
    public static void main(String[] args) {
        try{
            SubwayLoeader loader = new SubwayLoeader();
            Subway  objectVille = loader.loadFromFile(new File("c://temp/subway.txt"));
            System.out.println("--------------------------------subway Load");

            if(objectVille.hasStation("DRY Drive") &&
                    objectVille.hasStation("Weather-O-Rama, inc.") &&
                    objectVille.hasStation("Boards 'R' Us")){
                System.out.println("----------역 테스트 성공!");
            }else {
                System.out.println("--------역 테스트 실패!");
                System.exit(-1);
            }

            System.out.println(" \n------Test Connection----------");

            if(objectVille.hasConnection("DRY Drive", "Head First Theater","Meyer Line")&&
                    objectVille.hasConnection("Weather-O-Rama, inc.","XHTML Expressway" , "Wirfs-Brock Line")&&
                    objectVille.hasConnection("Head First Theater", "Infinite Circle", "Rumbaugh Line")){
                System.out.println("000000000000000 연결 테스트 성공");

            }else {
                System.out.println("----------------연결 테스트 실패");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
