package com.miguelsportal.googleloginm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by James on 11/12/2016.
 */

public final class DataProvider
{
    public static List<Trail> trailList = new ArrayList<>();
    public static Map<String, Trail> trailMap = new HashMap<>();

    private static void addProduct(String itemId, String name, String description)
    {
        Trail item = new Trail(itemId, name, description);
        trailList.add(item);
        trailMap.put(itemId, item);
    }

    static
    {//Trails and their descriptions taken from http://visitoswegocounty.com/the-great-outdoors/hiking-biking-trails/ @ 11/12/2015

        addProduct("trail100",
                "Albion Cross Trail",
                "NYS Rte. 13, Town of Albion\nThis trail is 2.3 miles long and is a multi-use facility. It is also used by snowmobile and ATV users. The trail commences at the intersection of NYS Route 13 and trends northwest to the hamlet of Altmar.");

        addProduct("trail101",
                "Amboy 4H Environmental Education Center",
                "NYS Rte. 183, Amboy\n3 miles hiking trails through 150 wooded acres. 3.5 miles north of Amboy Center.");

        addProduct("trail102",
                "Chateaugay State Forest",
                "Co. Rtes. 2 and 50, Orwell\nNetwork of 7 miles marked trails and 8 miles unplowed roads for hiking and cross-country skiing. 7.5 miles east of Pulaski.");

        addProduct("trail103",
                "Deer Creek Marsh",
                "Rainbow Shores Road, Richland\n1,195 acres of wetland and uplands between Lake Ontario and NYS Rte. 3 in town of Richland. Viewing tower, parking area, handicapped access. Scenic vistas, bird watching, cross-country skiing, snowshoeing.");

        addProduct("trail104",
                "Derby Hill Bird Observatory",
                "Sage Creek Road, Mexico\nPrime location for viewing migrating birds of prey and waterfowl. More than 40,000 counted annually. Owned by Onondaga Chapter of the NYS Audubon Society. Weather/hawk hotline, early March to late May: 315-963-8291. Off NYS Rte. 104B in Town of Mexico.");

        addProduct("trail105",
                "Fallbrook Recreation Center",
                "Thompson Rd., Oswego\nTrails connect to Rice Creek Field Station trails, for a combined total of 20 miles of trails");

        addProduct("trail106",
                "Great Bear Springs Recreation Area",
                "City of Fulton and Town of Volney\nComprised of 236 acres owned by the City of Fulton and the 78 acre Town of Volney Park.");

        addProduct("trail107",
                "Happy Valley Wildlife Management Area",
                "NYS Rte. 104, Albion, Williamstown; Co. Rte. 26, Parish, Amboy.\n8,645 acres of uplands, wetlands, ponds. Hiking, birding, canoeing, cross-country skiing, snowshoeing. No off-road motor vehicles allowed.");

        addProduct("trail108",
                "Hastings Town Park",
                "Wilson Rd., Hastings\n100 acres of park land, 3 miles of marked trails.");

        addProduct("trail109",
                "Independence Park",
                "Riker’s Beach Rd., Scriba\nThe park, owned by Oswego County, has two miles of hiking trails, .8 mile of which are wheelchair accessible, on 47.3 acres adjacent to Lake Ontario.");

        addProduct("trail110",
                "Klondike State Forest",
                "Amboy\n875 Acres.  5 miles of ungroomed trails. Surrounded by numerous ponds. Off NYS Rte. 69, corner of Tanner and Starks Rds., Amboy.");

        addProduct("trail111",
                "Littlejohn State Wildlife Management Area",
                "Co. Rte. 17, Boylston and Redfield\n8,020 acres of uplands and wetlands, with 18.8 miles of trails. Hiking, birding, cross-country skiing, and snowshoeing.");

        addProduct("trail112",
                "Mexico Point Park",
                "Mexico Point Drive, Mexico\nNature trail. Medieval-style cottage open for tours by appointment. Off NYS Rte.104B.");

        addProduct("trail113",
                "Oswego County Forest Land",
                "NYS Rte. 13 & Ball Rd., Williamstown\nThere is a .75 mile trail on 112.36 acres. The property contains both pine plantations and naturally regenerated deciduous woods. The trail can be used in all four seasons.");

        addProduct("trail114",
                "Oswego County Nature Park at Camp Zerbe",
                "NYS Rte. 104, Williamstown\nOffers nature enthusiasts hundreds 364 acres of wilderness, and includes beautiful and unique glacier-made “kettlehole” lakes which attract a variety of wildlife. The park features 3 miles of marked nature trails, interpretive center, pavilion, educational exhibits, and a meeting center. Hiking, canoeing, birding, cross-country skiing, snowshoeing.  Camp Zerbe is open from dawn to dusk. The meeting center and interpretive center are open by appointment. Pets and motorized vehicles are not allowed in the park. ");

        addProduct("trail115",
                "Oswego County Recreation Trail",
                "Maple Avenue, Volney to NYS Rte. 49, Cleveland\n26 miles. Ideal for hiking, biking, horseback riding, cross-country skiing, snowmobiling. Parking access at Co. Rte. 6, Volney.");

        addProduct("trail116",
                "Oswego East and West Riverwalks",
                "City of Oswego\nPaved walkways stretch along both sides of the Oswego River from the harbor to Lock 7. The paths are connected by a pedestrian bridge that crosses the river near Utica Street.");

        addProduct("trail117",
                "Rice Creek Biological Field Station",
                "Thompson Road, Oswego State University\nAn instructional and research unit of the State University of New York College at Oswego, the state property consists of the 26-acre Rice Pond surrounded by 400 acres of land in several stages of growth from open fields to mature forests. Trails provide access to the various habitats around the station. The building contains two lab/classrooms, a lecture room, and exhibit areas with an indoor viewing gallery. Hiking, birding, exhibits, lectures and workshops. Rice Creek Field Station is open weekdays from 9 a.m. to 5 p.m. Trails are open from dawn to dusk.");

        addProduct("trail118",
                "Richard A. Noyes Bird Sanctuary",
                "Nine Mile Point Rd., Town of New Haven\nOver two miles of trails on nearly 90 acres along Lake Ontario. The property is owned by the Onondaga Audubon Society.");

        addProduct("trail119",
                "Sage Creek Trail",
                "County Rte. 41, Town of Mexico\nThe trail is an abandoned railroad right-of-way maintained for multi-use recreation. The trail begins at County Route 41 in the Town of Mexico and goes 4.7 mile north to Atkinson Road in the Town of Richland.");

        addProduct("trail120",
                "Salmon River Falls Unique Area",
                "Falls Road, Orwell\n110-foot waterfall provides a breathtaking view any time of the year. Areas of gorge are restricted and visitors should use extreme caution. Footpath to the bottom of the gorge open May 1 to Nov. 15. Owned by NYS DEC. 1.4 miles northeast of Co. Rte. 22.");

        addProduct("trail121",
                "Salmon River State Forest",
                "Co. Rtes. 2 & 17, Redfield\n3 miles of trails.");

        addProduct("trail122",
                "Sandy Creek Community Park",
                "U.S. Rte. 11, Sandy Creek\n1 and .5 miles of marked trails, other unmarked trails.");

        addProduct("trail123",
                "Sandy Island Beach State Park",
                "3387 Co. Rte. 15, Sandy Creek\n11 acres of sandy beach on Lake Ontario. Part of the unique Eastern Lake Ontario Dune and Wetland System. Swimming, fishing, birding, hiking, canoeing, kayaking.");

        addProduct("trail124",
                "Selkirk Shores State Park",
                "7101 NYS Rte. 3, Pulaski\n980-acre multiple-use park overlooking Lake Ontario.  Swimming beach, camping, fishing, hiking, biking, snowshoeing, cross-country skiing, snowmobiling. Includes day-use picnic area, pavilions, nearby Pine Grove boat launch, and woodland trail.");

        addProduct("trail125",
                "Sunset Bay Park",
                "E. Lake Rd., Scriba\n1 mile of marked trails.");

        addProduct("trail126",
                "Three Mile Bay/Big Bay State Wildlife Management Area",
                "Off NYS Rte. 49, West Monroe and Constantia\n3,500-acre wetlands area. Hiking, boat access, birding, cross-country skiing, snowshoeing, hunting, fishing, trapping. 6 miles east of Central Square. Access from NYS Rte. 49 via Toad Harbor Road or Lower Road to Wheeler Road and West Road.");

        addProduct("trail127",
                "Trout Brook State Forest",
                "Off Co. Rte. 22, Bremm Road, Sandy Creek and Boylston\n3 miles of trails.");

        addProduct("trail128",
                "Winona State Forest Recreation Area",
                "Center Road, Boylston\nWinona Forest, located on the boundary of southern Jefferson County and northern Oswego County in Northern New York, is a 9,233-acre state forest that offers many recreational opportunities, including: snowmobiling, snowshoeing, hiking, cross-country skiing, mountain biking, hunting, fishing, trapping, dog sledding, bird watching and horseback riding.\n\nWinona Forest is one of the snowiest places east of the Rockies with an average snow fall of 250 inches per year! In winter, the prevailing westerly winds move cold winter air over the warm water of Lake Ontario producing massive lake effect snow falls on the Winona Forest in the Tug Hill area.\n\nParking on north side of Center Road at Wart Road intersection and Bargy Road intersection, in Boylston.");
    }


    public static List<String> getTrailNames()
    {
        List<String> list = new ArrayList<>();
        for (Trail trail : trailList)
        {
            list.add(trail.getName());
        }
        return list;
    }

    public static List<Trail> getFilteredList(String searchString)
    {
        List<Trail> filteredList = new ArrayList<>();
        for (Trail trail : trailList)
        {
            if (trail.getTrailID().contains(searchString))
            {
                filteredList.add(trail);
            }
        }
        return filteredList;
    }
}
