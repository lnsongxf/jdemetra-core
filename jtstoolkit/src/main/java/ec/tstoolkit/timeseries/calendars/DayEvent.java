/*
* Copyright 2013 National Bank of Belgium
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

package ec.tstoolkit.timeseries.calendars;

/**
 *
 * @author Jean Palate
 */
public enum DayEvent {

    /**
     * January, 1
     */
    NewYear,
    /**
     * AshWednesday (39 days before Easter)
     */
    AshWednesday,
    /**
     * Easter
     */
    Easter,
    /**
     * Last Thursday before Easter
     */
    MaundyThursday,
    /**
     * Last Friday before Easter
     */
    GoodFriday,
    /**
     * First Monday after Easter
     */
    EasterMonday,
    /**
     * Ascension (39 days after Easter)
     */
    Ascension,
    /**
     * Pentecost (49 days after Easter)
     */
    Pentecost,
    /**
     * First Monday after Pentecost (50 days after Easter)
     */
    WhitMonday,
    /**
     * May, 1
     */
    MayDay,
    /**
     * August, 15
     */
    Assumption,
    /**
     * Second Tuesday of September
     */
    //LaborDay,
    /**
     * October, 31
     */
    Halloween,
    /**
     * November, 1
     */
    AllSaintsDay,
    /**
     * Fourth Thursday of November
     */
    //ThanksGiving,
    /**
     * December, 25
     */
    Christmas
}
