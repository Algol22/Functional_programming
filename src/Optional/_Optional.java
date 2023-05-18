package Optional;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Optional;

public class _Optional {

    public static void main(String[] args) {
Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("send email to " + email),
                        ()-> System.out.println("no email"));


    }
}
