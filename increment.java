{

}int x=10;

x=x+1;

System.out.println(x);int x=10;

x++;

System.out.println(x);int x=10;

x--;

System.out.println(x);x++; // x = x + 1
x--; // x = x - 1

x+=5; // x = x + 5
x-=5; // x = x - 5
x*=2; // x = x * 2
x/=2; // x = x / 2
x%=3; // x = x % 3
class AssignmentDemo {
    public static void main(String[] args) {

        int x = 10;

        x += 5;
        System.out.println(x);

        x -= 3;
        System.out.println(x);

        x *= 2;
        System.out.println(x);

        x /= 4;
        System.out.println(x);

        x %= 3;
        System.out.println(x);
    }
}