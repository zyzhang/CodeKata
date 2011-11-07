package zhang.abel.codekata.primefactors;

import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static zhang.abel.codekata.primefactors.PrimeFactors.generate;

public class PrimeFactorsTest {

    @Test
    public void should_return_emppty_list_given_input_1() {
        assertThat(generate(1), is(Collections.EMPTY_LIST));
    }

    @Test
    public void should_return_2_given_input_2() {
        assertThat(generate(2), is(asList(2)));
    }

    @Test
    public void should_return_3_given_input_3() {
        assertThat(generate(3), is(asList(3)));
    }

    @Test
    public void should_return_2_2_given_input_4() {
        assertThat(generate(4), is(asList(2, 2)));
    }

    @Test
    public void should_return_2_2_2_given_input_8() {
        assertThat(generate(8), is(asList(2, 2, 2)));
    }

    @Test
    public void should_return_3_3_given_input_9() {
        assertThat(generate(9), is(asList(3, 3)));
    }

    @Test
    public void should_() {
        assertThat(generate(8765432), is(asList(1)));
    }
}
