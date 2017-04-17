package il.co.galex.bnetapi.testapp;

import org.junit.Test;

import il.co.galex.bnetapi.d3.utils.D3IconsUtils;

import static org.junit.Assert.*;

/**
 * Tests the url icons utility class.
 */
public class D3IconUtilsTest {

    private static final String ITEM_ICON = "unique_dagger_007_x1_demonhunter_male";
    private static final String SKILL_ICON = "wizard_energyarmor";

    @Test
    public void itemsSmall() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.ITEMS;
        D3IconsUtils.ItemSize size = D3IconsUtils.ItemSize.SMALL;

        String url = D3IconsUtils.getUrl(type, size, ITEM_ICON);
        assertTrue("http://media.blizzard.com/d3/icons/items/small/unique_dagger_007_x1_demonhunter_male.png".equals(url));
    }

    @Test
    public void itemsLarge() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.ITEMS;
        D3IconsUtils.ItemSize size = D3IconsUtils.ItemSize.LARGE;

        String url = D3IconsUtils.getUrl(type, size, ITEM_ICON);
        assertTrue("http://media.blizzard.com/d3/icons/items/large/unique_dagger_007_x1_demonhunter_male.png".equals(url));
    }

    @Test
    public void skillsSmall() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.SKILLS;
        D3IconsUtils.SkillsSize size = D3IconsUtils.SkillsSize.SMALL;

        String url = D3IconsUtils.getUrl(type, size, SKILL_ICON);
        assertTrue("http://media.blizzard.com/d3/icons/skills/21/wizard_energyarmor.png".equals(url));
    }

    @Test
    public void skillsMedium() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.SKILLS;
        D3IconsUtils.SkillsSize size = D3IconsUtils.SkillsSize.MEDIUM;

        String url = D3IconsUtils.getUrl(type, size, SKILL_ICON);
        assertTrue("http://media.blizzard.com/d3/icons/skills/42/wizard_energyarmor.png".equals(url));
    }

    @Test
    public void skillsLarge() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.SKILLS;
        D3IconsUtils.SkillsSize size = D3IconsUtils.SkillsSize.LARGE;

        String url = D3IconsUtils.getUrl(type, size, SKILL_ICON);
        assertTrue("http://media.blizzard.com/d3/icons/skills/64/wizard_energyarmor.png".equals(url));
    }

    @Test(expected = IllegalArgumentException.class)
    public void itemsWithSkillsSize() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.ITEMS;
        D3IconsUtils.SkillsSize size = D3IconsUtils.SkillsSize.SMALL;

        D3IconsUtils.getUrl(type, size, SKILL_ICON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void skillsWithItemsSize() throws Exception {

        D3IconsUtils.Type type = D3IconsUtils.Type.SKILLS;
        D3IconsUtils.ItemSize size = D3IconsUtils.ItemSize.SMALL;

        D3IconsUtils.getUrl(type, size, SKILL_ICON);
    }
}