package encapsulation.and.inheritance.ball;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Water {
    private boolean isColorless;
    private boolean isOdourless;
    private boolean isTasteless;

    public Water(boolean isColorless, boolean isOdourless, boolean isTasteless) {
        this.isColorless = isColorless;
        this.isOdourless = isOdourless;
        this.isTasteless = isTasteless;
    }
}
