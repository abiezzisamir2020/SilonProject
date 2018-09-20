public class Main {

    public static void main(String[] args) {
	// write your code here
        float h1 = 72.0f;
        float h2 = 19.0f;
        float h3 = 50.0f;
        float h4 = 67.0f;
        float h5 = 16.0f;
        float h6 = 53.0f;
        float h7 = 69.0f;
        float h8 = 30.0f;
        float h9 = 52.0f;
        float h10 = 40.0f;
        float h11 = 31.0f;
        float h12 = 75.0f;

        float pi = 3.14f;

        float d1 = 22.0f;
        float d2 = 18.0f;
        float d3 = 13.0f;
        float d4 = 16.0f;
        float d5 = 14.0f;
        float d6 = 23.0f;
        float d7 = 22.0f;
        float d8 = 22.0f;
        float d9 = 23.0f;
        float d10 = 16.0f;
        float d11 = 18.0f;
        float d12 = 23.0f;

        float towerV1 = (d1/2)*(d1/2)*pi*h1;
        float towerV2 = (d2/2)*(d2/2)*pi*h2;
        float towerV3 = (d3/2)*(d3/2)*pi*h3;
        float towerV4 = (d4/2)*(d4/2)*pi*h4;
        float towerV5 = (d5/2)*(d5/2)*pi*h5;
        float towerV6 = (d6/2)*(d6/2)*pi*h6;
        float towerV7 = (d7/2)*(d7/2)*pi*h7;
        float towerV8 = (d8/2)*(d8/2)*pi*h8;
        float towerV9 = (d9/2)*(d9/2)*pi*h9;
        float towerV10 = (d10/2)*(d10/2)*pi*h10;
        float towerV11 = (d11/2)*(d11/2)*pi*h11;
        float towerV12 = (d12/2)*(d12/2)*pi*h12;

        float totalwater = towerV1+towerV2+towerV3+towerV4+towerV5+towerV6+towerV7+towerV8+towerV9+towerV10+towerV11+towerV12;
        int pop = 37640;

        float cubicm = 0.246f*pop*28;

        float NS = cubicm-totalwater;
        float NSP = NS/28/37640;

        System.out.println("The town will need to save "+ NS + "cubic meters of water in total" );
        System.out.println("they will need to save "+ NSP + "cubic meters of water per person");





    }
}
