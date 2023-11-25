package com.habitrpg.android.habitica.helpers;

/* compiled from: UserStatComputer.kt */
/* loaded from: classes4.dex */
public final class UserStatComputer {
    public static final int $stable = 0;

    /* compiled from: UserStatComputer.kt */
    /* loaded from: classes4.dex */
    public final class AttributeRow implements StatsRow {
        private float conVal;
        private float intVal;
        private int labelId;
        private float perVal;
        private boolean roundDown;
        private float strVal;
        private boolean summary;

        public AttributeRow() {
        }

        public final float getConVal() {
            return this.conVal;
        }

        public final float getIntVal() {
            return this.intVal;
        }

        public final int getLabelId() {
            return this.labelId;
        }

        public final float getPerVal() {
            return this.perVal;
        }

        public final boolean getRoundDown() {
            return this.roundDown;
        }

        public final float getStrVal() {
            return this.strVal;
        }

        public final boolean getSummary() {
            return this.summary;
        }

        public final void setConVal(float f10) {
            this.conVal = f10;
        }

        public final void setIntVal(float f10) {
            this.intVal = f10;
        }

        public final void setLabelId(int i10) {
            this.labelId = i10;
        }

        public final void setPerVal(float f10) {
            this.perVal = f10;
        }

        public final void setRoundDown(boolean z10) {
            this.roundDown = z10;
        }

        public final void setStrVal(float f10) {
            this.strVal = f10;
        }

        public final void setSummary(boolean z10) {
            this.summary = z10;
        }
    }

    /* compiled from: UserStatComputer.kt */
    /* loaded from: classes4.dex */
    public final class EquipmentRow implements StatsRow {
        private String gearKey;
        private String stats;
        private String text;

        public EquipmentRow() {
        }

        public final String getGearKey() {
            return this.gearKey;
        }

        public final String getStats() {
            return this.stats;
        }

        public final String getText() {
            return this.text;
        }

        public final void setGearKey(String str) {
            this.gearKey = str;
        }

        public final void setStats(String str) {
            this.stats = str;
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    /* compiled from: UserStatComputer.kt */
    /* loaded from: classes4.dex */
    public interface StatsRow {
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0130, code lost:
    
        if (qc.q.d(r2, "special") == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.habitrpg.android.habitica.helpers.UserStatComputer.StatsRow> computeClassBonus(java.util.List<? extends com.habitrpg.android.habitica.models.inventory.Equipment> r24, com.habitrpg.shared.habitica.models.Avatar r25) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.UserStatComputer.computeClassBonus(java.util.List, com.habitrpg.shared.habitica.models.Avatar):java.util.List");
    }
}
