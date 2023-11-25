package com.habitrpg.android.habitica.models.user;

import com.habitrpg.android.habitica.models.BaseObject;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.t7;
import java.util.Date;
import qc.h;
import qc.q;

/* compiled from: SubscriptionPlan.kt */
/* loaded from: classes4.dex */
public class SubscriptionPlan extends d1 implements BaseObject, t7 {
    private Boolean active;
    private AdditionalSubscriptionInfo additionalData;
    private SubscriptionPlanConsecutive consecutive;
    private String customerId;
    private Date dateCreated;
    public Date dateTerminated;
    private Date dateUpdated;
    private Integer extraMonths;
    private Integer gemsBought;
    private int mysteryItemCount;
    @c("owner")
    private String ownerID;
    private String paymentMethod;
    private int perkMonthCount;
    public String planId;
    private Integer quantity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static String PLANID_BASIC = "basic";
    private static String PLANID_BASICEARNED = "basic_earned";
    private static String PLANID_BASIC3MONTH = "basic_3mo";
    private static String PLANID_BASIC6MONTH = "basic_6mo";
    private static String PLANID_GOOGLE6MONTH = "google_6mo";
    private static String PLANID_BASIC12MONTH = "basic_12mo";

    /* compiled from: SubscriptionPlan.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String getPLANID_BASIC() {
            return SubscriptionPlan.PLANID_BASIC;
        }

        public final String getPLANID_BASIC12MONTH() {
            return SubscriptionPlan.PLANID_BASIC12MONTH;
        }

        public final String getPLANID_BASIC3MONTH() {
            return SubscriptionPlan.PLANID_BASIC3MONTH;
        }

        public final String getPLANID_BASIC6MONTH() {
            return SubscriptionPlan.PLANID_BASIC6MONTH;
        }

        public final String getPLANID_BASICEARNED() {
            return SubscriptionPlan.PLANID_BASICEARNED;
        }

        public final String getPLANID_GOOGLE6MONTH() {
            return SubscriptionPlan.PLANID_GOOGLE6MONTH;
        }

        public final void setPLANID_BASIC(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_BASIC = str;
        }

        public final void setPLANID_BASIC12MONTH(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_BASIC12MONTH = str;
        }

        public final void setPLANID_BASIC3MONTH(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_BASIC3MONTH = str;
        }

        public final void setPLANID_BASIC6MONTH(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_BASIC6MONTH = str;
        }

        public final void setPLANID_BASICEARNED(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_BASICEARNED = str;
        }

        public final void setPLANID_GOOGLE6MONTH(String str) {
            q.i(str, "<set-?>");
            SubscriptionPlan.PLANID_GOOGLE6MONTH = str;
        }
    }

    public SubscriptionPlan() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Boolean getActive() {
        return realmGet$active();
    }

    public final AdditionalSubscriptionInfo getAdditionalData() {
        return realmGet$additionalData();
    }

    public final SubscriptionPlanConsecutive getConsecutive() {
        return realmGet$consecutive();
    }

    public final String getCustomerId() {
        return realmGet$customerId();
    }

    public final Date getDateCreated() {
        return realmGet$dateCreated();
    }

    public final Date getDateUpdated() {
        return realmGet$dateUpdated();
    }

    public final Integer getExtraMonths() {
        return realmGet$extraMonths();
    }

    public final Integer getGemsBought() {
        return realmGet$gemsBought();
    }

    public final int getMonthsUntilNextHourglass() {
        int i10;
        if (getSubMonthCount() > 1) {
            SubscriptionPlanConsecutive realmGet$consecutive = realmGet$consecutive();
            if (realmGet$consecutive != null) {
                i10 = realmGet$consecutive.getOffset();
            } else {
                i10 = 0;
            }
            return i10 + 1;
        }
        return 3 - realmGet$perkMonthCount();
    }

    public final int getMysteryItemCount() {
        return realmGet$mysteryItemCount();
    }

    public final int getNumberOfGemsLeft() {
        int i10;
        int totalNumberOfGems = getTotalNumberOfGems();
        Integer realmGet$gemsBought = realmGet$gemsBought();
        if (realmGet$gemsBought != null) {
            i10 = realmGet$gemsBought.intValue();
        } else {
            i10 = 0;
        }
        return totalNumberOfGems - i10;
    }

    public final String getOwnerID() {
        return realmGet$ownerID();
    }

    public final String getPaymentMethod() {
        return realmGet$paymentMethod();
    }

    public final int getPerkMonthCount() {
        return realmGet$perkMonthCount();
    }

    public final Integer getQuantity() {
        return realmGet$quantity();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getSubMonthCount() {
        /*
            r4 = this;
            java.lang.String r0 = r4.realmGet$planId()
            if (r0 == 0) goto L4d
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 6
            switch(r1) {
                case -1698887292: goto L42;
                case -1698884409: goto L37;
                case -1534877358: goto L2e;
                case -1126014732: goto L22;
                case -207307963: goto L19;
                case 1763873704: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4d
        L10:
            java.lang.String r1 = "basic_earned"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L4d
        L19:
            java.lang.String r1 = "group_plan_auto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L4d
        L22:
            java.lang.String r1 = "basic_12mo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4d
        L2b:
            r2 = 12
            goto L4e
        L2e:
            java.lang.String r1 = "google_6mo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4d
        L37:
            java.lang.String r1 = "basic_6mo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4d
        L40:
            r2 = 6
            goto L4e
        L42:
            java.lang.String r1 = "basic_3mo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r2 = 3
            goto L4e
        L4d:
            r2 = 0
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.user.SubscriptionPlan.getSubMonthCount():int");
    }

    public final int getTotalNumberOfGems() {
        int i10 = 0;
        if (!isActive()) {
            return 0;
        }
        SubscriptionPlanConsecutive realmGet$consecutive = realmGet$consecutive();
        if (realmGet$consecutive != null) {
            i10 = realmGet$consecutive.getGemCapExtra();
        }
        return i10 + 25;
    }

    public final boolean isActive() {
        Date date = new Date();
        if (realmGet$customerId() != null) {
            if (realmGet$dateTerminated() != null) {
                Date realmGet$dateTerminated = realmGet$dateTerminated();
                q.f(realmGet$dateTerminated);
                if (realmGet$dateTerminated.after(date) || q.d(realmGet$active(), Boolean.TRUE)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isGiftedSub() {
        return q.d(realmGet$customerId(), "Gift");
    }

    public final boolean isGroupPlanSub() {
        return q.d(realmGet$customerId(), "group-plan");
    }

    @Override // io.realm.t7
    public Boolean realmGet$active() {
        return this.active;
    }

    @Override // io.realm.t7
    public AdditionalSubscriptionInfo realmGet$additionalData() {
        return this.additionalData;
    }

    @Override // io.realm.t7
    public SubscriptionPlanConsecutive realmGet$consecutive() {
        return this.consecutive;
    }

    @Override // io.realm.t7
    public String realmGet$customerId() {
        return this.customerId;
    }

    @Override // io.realm.t7
    public Date realmGet$dateCreated() {
        return this.dateCreated;
    }

    @Override // io.realm.t7
    public Date realmGet$dateTerminated() {
        return this.dateTerminated;
    }

    @Override // io.realm.t7
    public Date realmGet$dateUpdated() {
        return this.dateUpdated;
    }

    @Override // io.realm.t7
    public Integer realmGet$extraMonths() {
        return this.extraMonths;
    }

    @Override // io.realm.t7
    public Integer realmGet$gemsBought() {
        return this.gemsBought;
    }

    @Override // io.realm.t7
    public int realmGet$mysteryItemCount() {
        return this.mysteryItemCount;
    }

    @Override // io.realm.t7
    public String realmGet$ownerID() {
        return this.ownerID;
    }

    @Override // io.realm.t7
    public String realmGet$paymentMethod() {
        return this.paymentMethod;
    }

    @Override // io.realm.t7
    public int realmGet$perkMonthCount() {
        return this.perkMonthCount;
    }

    @Override // io.realm.t7
    public String realmGet$planId() {
        return this.planId;
    }

    @Override // io.realm.t7
    public Integer realmGet$quantity() {
        return this.quantity;
    }

    @Override // io.realm.t7
    public void realmSet$active(Boolean bool) {
        this.active = bool;
    }

    @Override // io.realm.t7
    public void realmSet$additionalData(AdditionalSubscriptionInfo additionalSubscriptionInfo) {
        this.additionalData = additionalSubscriptionInfo;
    }

    @Override // io.realm.t7
    public void realmSet$consecutive(SubscriptionPlanConsecutive subscriptionPlanConsecutive) {
        this.consecutive = subscriptionPlanConsecutive;
    }

    @Override // io.realm.t7
    public void realmSet$customerId(String str) {
        this.customerId = str;
    }

    @Override // io.realm.t7
    public void realmSet$dateCreated(Date date) {
        this.dateCreated = date;
    }

    @Override // io.realm.t7
    public void realmSet$dateTerminated(Date date) {
        this.dateTerminated = date;
    }

    @Override // io.realm.t7
    public void realmSet$dateUpdated(Date date) {
        this.dateUpdated = date;
    }

    @Override // io.realm.t7
    public void realmSet$extraMonths(Integer num) {
        this.extraMonths = num;
    }

    @Override // io.realm.t7
    public void realmSet$gemsBought(Integer num) {
        this.gemsBought = num;
    }

    @Override // io.realm.t7
    public void realmSet$mysteryItemCount(int i10) {
        this.mysteryItemCount = i10;
    }

    @Override // io.realm.t7
    public void realmSet$ownerID(String str) {
        this.ownerID = str;
    }

    @Override // io.realm.t7
    public void realmSet$paymentMethod(String str) {
        this.paymentMethod = str;
    }

    @Override // io.realm.t7
    public void realmSet$perkMonthCount(int i10) {
        this.perkMonthCount = i10;
    }

    @Override // io.realm.t7
    public void realmSet$planId(String str) {
        this.planId = str;
    }

    @Override // io.realm.t7
    public void realmSet$quantity(Integer num) {
        this.quantity = num;
    }

    public final void setActive(Boolean bool) {
        realmSet$active(bool);
    }

    public final void setAdditionalData(AdditionalSubscriptionInfo additionalSubscriptionInfo) {
        realmSet$additionalData(additionalSubscriptionInfo);
    }

    public final void setConsecutive(SubscriptionPlanConsecutive subscriptionPlanConsecutive) {
        realmSet$consecutive(subscriptionPlanConsecutive);
    }

    public final void setCustomerId(String str) {
        realmSet$customerId(str);
    }

    public final void setDateCreated(Date date) {
        realmSet$dateCreated(date);
    }

    public final void setDateUpdated(Date date) {
        realmSet$dateUpdated(date);
    }

    public final void setExtraMonths(Integer num) {
        realmSet$extraMonths(num);
    }

    public final void setGemsBought(Integer num) {
        realmSet$gemsBought(num);
    }

    public final void setMysteryItemCount(int i10) {
        realmSet$mysteryItemCount(i10);
    }

    public final void setOwnerID(String str) {
        realmSet$ownerID(str);
    }

    public final void setPaymentMethod(String str) {
        realmSet$paymentMethod(str);
    }

    public final void setPerkMonthCount(int i10) {
        realmSet$perkMonthCount(i10);
    }

    public final void setQuantity(Integer num) {
        realmSet$quantity(num);
    }
}
