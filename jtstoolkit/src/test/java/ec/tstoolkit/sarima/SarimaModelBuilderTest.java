/*
 * Copyright 2013-2014 National Bank of Belgium
 * 
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved 
 * by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 * 
 * http://ec.europa.eu/idabc/eupl
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and 
 * limitations under the Licence.
 */

package ec.tstoolkit.sarima;

import ec.tstoolkit.arima.ArimaModelBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Palate
 */
public class SarimaModelBuilderTest {
    
    public SarimaModelBuilderTest() {
    }

    @Test
    public void testRandom() {
        SarimaModelBuilder builder=new SarimaModelBuilder();
        SarimaModel arima=builder.createAirlineModel(12, -.8, -.9);
        for (int i=0; i<100; ++i){
        SarimaModel narima=builder.randomize(arima, .1);
        new ArimaModelBuilder().generate(narima, 100);
 //       System.out.println(narima);
        }
    }
    
}
