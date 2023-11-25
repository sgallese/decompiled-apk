package com.habitrpg.shared.habitica.models;

/* compiled from: Avatar.kt */
/* loaded from: classes4.dex */
public interface Avatar {

    /* compiled from: Avatar.kt */
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static AvatarOutfit getCostume(Avatar avatar) {
            AvatarGear gear;
            AvatarItems items = avatar.getItems();
            if (items != null && (gear = items.getGear()) != null) {
                return gear.getCostume();
            }
            return null;
        }

        public static String getCurrentMount(Avatar avatar) {
            String currentMount;
            AvatarItems items = avatar.getItems();
            if (items == null || (currentMount = items.getCurrentMount()) == null) {
                return "";
            }
            return currentMount;
        }

        public static String getCurrentPet(Avatar avatar) {
            String currentPet;
            AvatarItems items = avatar.getItems();
            if (items == null || (currentPet = items.getCurrentPet()) == null) {
                return "";
            }
            return currentPet;
        }

        public static AvatarOutfit getEquipped(Avatar avatar) {
            AvatarGear gear;
            AvatarItems items = avatar.getItems();
            if (items != null && (gear = items.getGear()) != null) {
                return gear.getEquipped();
            }
            return null;
        }

        public static String getFormattedUsername(Avatar avatar) {
            if (avatar.getUsername() != null) {
                return "@" + avatar.getUsername();
            }
            return null;
        }

        public static int getGemCount(Avatar avatar) {
            return (int) (avatar.getBalance() * 4);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean getHasClass(com.habitrpg.shared.habitica.models.Avatar r3) {
            /*
                com.habitrpg.shared.habitica.models.AvatarPreferences r0 = r3.getPreferences()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L10
                boolean r0 = r0.getDisableClasses()
                if (r0 != r1) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                if (r0 != 0) goto L57
                com.habitrpg.shared.habitica.models.AvatarFlags r0 = r3.getFlags()
                if (r0 == 0) goto L21
                boolean r0 = r0.getClassSelected()
                if (r0 != 0) goto L21
                r0 = 1
                goto L22
            L21:
                r0 = 0
            L22:
                if (r0 != 0) goto L57
                com.habitrpg.shared.habitica.models.AvatarStats r0 = r3.getStats()
                if (r0 == 0) goto L3d
                java.lang.String r0 = r0.getHabitClass()
                if (r0 == 0) goto L3d
                int r0 = r0.length()
                if (r0 <= 0) goto L38
                r0 = 1
                goto L39
            L38:
                r0 = 0
            L39:
                if (r0 != r1) goto L3d
                r0 = 1
                goto L3e
            L3d:
                r0 = 0
            L3e:
                if (r0 == 0) goto L57
                com.habitrpg.shared.habitica.models.AvatarStats r3 = r3.getStats()
                if (r3 == 0) goto L51
                java.lang.Integer r3 = r3.getLvl()
                if (r3 == 0) goto L51
                int r3 = r3.intValue()
                goto L52
            L51:
                r3 = 0
            L52:
                r0 = 10
                if (r3 < r0) goto L57
                goto L58
            L57:
                r1 = 0
            L58:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.shared.habitica.models.Avatar.DefaultImpls.getHasClass(com.habitrpg.shared.habitica.models.Avatar):boolean");
        }

        public static boolean getSleep(Avatar avatar) {
            AvatarPreferences preferences = avatar.getPreferences();
            if (preferences != null) {
                return preferences.getSleep();
            }
            return false;
        }

        public static String getUsername(Avatar avatar) {
            AvatarLocalAuthentication localAuthentication;
            AvatarAuthentication authentication = avatar.getAuthentication();
            if (authentication != null && (localAuthentication = authentication.getLocalAuthentication()) != null) {
                return localAuthentication.getUsername();
            }
            return null;
        }
    }

    AvatarAuthentication getAuthentication();

    double getBalance();

    AvatarOutfit getCostume();

    String getCurrentMount();

    String getCurrentPet();

    AvatarOutfit getEquipped();

    AvatarFlags getFlags();

    String getFormattedUsername();

    int getGemCount();

    boolean getHasClass();

    int getHourglassCount();

    String getId();

    AvatarItems getItems();

    AvatarPreferences getPreferences();

    boolean getSleep();

    AvatarStats getStats();

    String getUsername();

    boolean isValid();
}
