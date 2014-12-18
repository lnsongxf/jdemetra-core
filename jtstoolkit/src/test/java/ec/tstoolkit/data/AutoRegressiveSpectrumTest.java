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
package ec.tstoolkit.data;

import ec.tstoolkit.data.AutoRegressiveSpectrum.Method;
import ec.tstoolkit.timeseries.simplets.TsData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Palate
 */
public class AutoRegressiveSpectrumTest {
    
    public AutoRegressiveSpectrumTest() {
    }
    
    private TsData X=data.Data.P.delta(1).delta(12);

    @Test
    public void testDurbin() {
        AutoRegressiveSpectrum ar=new AutoRegressiveSpectrum(Method.Durbin);
        ar.process(X, 30);
        System.out.println(ar.getCoefficients());
        System.out.println(ar.getSigma());
    }
    
    @Test
    public void testOls() {
        AutoRegressiveSpectrum ar=new AutoRegressiveSpectrum(Method.Ols);
        ar.process(X, 30);
        System.out.println(ar.getCoefficients());
        System.out.println(ar.getSigma());
    }
}
