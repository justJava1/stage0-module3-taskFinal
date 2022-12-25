package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.reverse();
        System.out.println(sb);
    }
}
