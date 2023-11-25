package com.habitrpg.android.habitica.ui.activities;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.UserStatComputer;
import com.habitrpg.android.habitica.interactors.ShareAvatarUseCase;
import com.habitrpg.android.habitica.models.Achievement;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.AuthenticationTimestamps;
import com.habitrpg.android.habitica.models.user.Buffs;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.ui.adapter.social.AchievementProfileAdapter;
import com.habitrpg.android.habitica.ui.fragments.ReportBottomSheetFragment;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;
import com.habitrpg.common.habitica.helpers.RecyclerViewState;
import com.habitrpg.common.habitica.views.PixelArtView;
import j0.d3;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: FullProfileActivity.kt */
/* loaded from: classes4.dex */
public final class FullProfileActivity extends Hilt_FullProfileActivity {
    public ApiClient apiClient;
    private float attributeConSum;
    private boolean attributeDetailsHidden;
    private float attributeIntSum;
    private float attributePerSum;
    private final ArrayList<TableRow> attributeRows;
    private float attributeStrSum;
    private ActivityFullProfileBinding binding;
    private List<String> blocks;
    private final DateFormat dateFormatter;
    public InventoryRepository inventoryRepository;
    private boolean isModerator;
    private boolean isUserSupport;
    private j0.j1<Member> member;
    public ReviewManager reviewManager;
    public SharedPreferences sharedPrefs;
    public SocialRepository socialRepository;
    private String userDisplayName;
    private String userID;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FullProfileActivity.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        public final void open(String str) {
            qc.q.i(str, TaskFormActivity.USER_ID_KEY);
            if (qc.q.d(str, "system")) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("userID", str);
            MainNavigationController.INSTANCE.navigate(R.id.fullProfileActivity, bundle);
        }
    }

    public FullProfileActivity() {
        List<String> i10;
        j0.j1<Member> e10;
        i10 = ec.t.i();
        this.blocks = i10;
        e10 = d3.e(null, null, 2, null);
        this.member = e10;
        this.userID = "";
        this.attributeDetailsHidden = true;
        this.attributeRows = new ArrayList<>();
        this.dateFormatter = DateFormat.getDateInstance();
    }

    private final void addAttributeRow(String str, float f10, float f11, float f12, float f13, boolean z10, boolean z11) {
        TableRow tableRow;
        LayoutInflater layoutInflater = getLayoutInflater();
        ActivityFullProfileBinding activityFullProfileBinding = this.binding;
        ActivityFullProfileBinding activityFullProfileBinding2 = null;
        if (activityFullProfileBinding == null) {
            qc.q.z("binding");
            activityFullProfileBinding = null;
        }
        int i10 = 0;
        View inflate = layoutInflater.inflate(R.layout.profile_attributetablerow, (ViewGroup) activityFullProfileBinding.attributesTableLayout, false);
        if (inflate instanceof TableRow) {
            tableRow = (TableRow) inflate;
        } else {
            tableRow = null;
        }
        if (tableRow == null) {
            return;
        }
        TextView textView = (TextView) tableRow.findViewById(R.id.tv_attribute_type);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) tableRow.findViewById(R.id.tv_attribute_str);
        if (textView2 != null) {
            textView2.setText(getFloorValueString(f10, z10));
        }
        TextView textView3 = (TextView) tableRow.findViewById(R.id.tv_attribute_int);
        if (textView3 != null) {
            textView3.setText(getFloorValueString(f11, z10));
        }
        TextView textView4 = (TextView) tableRow.findViewById(R.id.tv_attribute_con);
        if (textView4 != null) {
            textView4.setText(getFloorValueString(f12, z10));
        }
        TextView textView5 = (TextView) tableRow.findViewById(R.id.tv_attribute_per);
        if (textView5 != null) {
            textView5.setText(getFloorValueString(f13, z10));
        }
        if (z11) {
            if (textView2 != null) {
                textView2.setTypeface(null, 1);
            }
            if (textView3 != null) {
                textView3.setTypeface(null, 1);
            }
            if (textView4 != null) {
                textView4.setTypeface(null, 1);
            }
            if (textView5 != null) {
                textView5.setTypeface(null, 1);
            }
        } else {
            this.attributeStrSum += getFloorValue(f10, z10);
            this.attributeIntSum += getFloorValue(f11, z10);
            this.attributeConSum += getFloorValue(f12, z10);
            this.attributePerSum += getFloorValue(f13, z10);
            this.attributeRows.add(tableRow);
            if (this.attributeDetailsHidden) {
                i10 = 8;
            }
            tableRow.setVisibility(i10);
        }
        ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
        if (activityFullProfileBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityFullProfileBinding2 = activityFullProfileBinding3;
        }
        activityFullProfileBinding2.attributesTableLayout.addView(tableRow);
    }

    private final void addEquipmentRow(TableLayout tableLayout, String str, String str2, String str3) {
        TableRow tableRow;
        PixelArtView pixelArtView;
        TextView textView;
        boolean z10;
        boolean z11 = false;
        View inflate = getLayoutInflater().inflate(R.layout.profile_gear_tablerow, (ViewGroup) tableLayout, false);
        TextView textView2 = null;
        if (inflate instanceof TableRow) {
            tableRow = (TableRow) inflate;
        } else {
            tableRow = null;
        }
        if (tableRow != null) {
            pixelArtView = (PixelArtView) tableRow.findViewById(R.id.gear_drawee);
        } else {
            pixelArtView = null;
        }
        if (pixelArtView != null) {
            DataBindingUtilsKt.loadImage$default(pixelArtView, "shop_" + str, null, 2, null);
        }
        if (tableRow != null) {
            textView = (TextView) tableRow.findViewById(R.id.tableRowTextView1);
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str2);
        }
        if (tableRow != null) {
            textView2 = (TextView) tableRow.findViewById(R.id.tableRowTextView2);
        }
        if (str3 != null) {
            if (str3.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            if (textView2 != null) {
                textView2.setText(str3);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        tableLayout.addView(tableRow);
    }

    private final void addLevelAttributes(Member member) {
        int i10;
        Integer lvl;
        Stats stats = member.getStats();
        if (stats != null && (lvl = stats.getLvl()) != null) {
            i10 = lvl.intValue();
        } else {
            i10 = 0;
        }
        float min = Math.min(i10 / 2.0f, 50.0f);
        String string = getString(R.string.profile_level);
        qc.q.h(string, "getString(...)");
        addAttributeRow(string, min, min, min, min, true, false);
    }

    private final void addNormalAddBuffAttributes(Stats stats) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Float per;
        Float con;
        Float f18;
        Float str;
        Buffs buffs = stats.getBuffs();
        String string = getString(R.string.profile_allocated);
        qc.q.h(string, "getString(...)");
        Integer strength = stats.getStrength();
        if (strength != null) {
            f10 = strength.intValue();
        } else {
            f10 = 0.0f;
        }
        Integer intelligence = stats.getIntelligence();
        if (intelligence != null) {
            f11 = intelligence.intValue();
        } else {
            f11 = 0.0f;
        }
        Integer constitution = stats.getConstitution();
        if (constitution != null) {
            f12 = constitution.intValue();
        } else {
            f12 = 0.0f;
        }
        Integer per2 = stats.getPer();
        if (per2 != null) {
            f13 = per2.intValue();
        } else {
            f13 = 0.0f;
        }
        addAttributeRow(string, f10, f11, f12, f13, true, false);
        String string2 = getString(R.string.buffs);
        qc.q.h(string2, "getString(...)");
        if (buffs != null && (str = buffs.getStr()) != null) {
            f14 = str.floatValue();
        } else {
            f14 = 0.0f;
        }
        if (buffs != null && (f18 = buffs.get_int()) != null) {
            f15 = f18.floatValue();
        } else {
            f15 = 0.0f;
        }
        if (buffs != null && (con = buffs.getCon()) != null) {
            f16 = con.floatValue();
        } else {
            f16 = 0.0f;
        }
        if (buffs != null && (per = buffs.getPer()) != null) {
            f17 = per.floatValue();
        } else {
            f17 = 0.0f;
        }
        addAttributeRow(string2, f14, f15, f16, f17, true, false);
        addAttributeRow("", this.attributeStrSum, this.attributeIntSum, this.attributeConSum, this.attributePerSum, false, true);
    }

    private final void banUser() {
        Authentication authentication;
        Member value = this.member.getValue();
        boolean z10 = false;
        if (value != null && (authentication = value.getAuthentication()) != null && authentication.getBlocked()) {
            z10 = true;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        if (z10) {
            habiticaAlertDialog.setTitle(R.string.unban_user_confirm);
        } else {
            habiticaAlertDialog.setTitle(R.string.ban_user_confirm);
        }
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, true, false, (pc.p) new FullProfileActivity$banUser$1(this, z10), 8, (Object) null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillAchievements(List<? extends Achievement> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<? extends Achievement> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (qc.q.d(((Achievement) obj).getCategory(), "basic")) {
                arrayList2.add(obj);
            }
        }
        fillAchievements(R.string.basic_achievements, arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (qc.q.d(((Achievement) obj2).getCategory(), "seasonal")) {
                arrayList3.add(obj2);
            }
        }
        fillAchievements(R.string.seasonal_achievements, arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list2) {
            if (qc.q.d(((Achievement) obj3).getCategory(), "special")) {
                arrayList4.add(obj3);
            }
        }
        fillAchievements(R.string.special_achievements, arrayList4, arrayList);
        final AchievementProfileAdapter achievementProfileAdapter = new AchievementProfileAdapter();
        achievementProfileAdapter.setItemList(arrayList);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.activities.FullProfileActivity$fillAchievements$4
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                if (AchievementProfileAdapter.this.getItemViewType(i10) == 0) {
                    return gridLayoutManager.e3();
                }
                return 1;
            }
        });
        ActivityFullProfileBinding activityFullProfileBinding = this.binding;
        ActivityFullProfileBinding activityFullProfileBinding2 = null;
        if (activityFullProfileBinding == null) {
            qc.q.z("binding");
            activityFullProfileBinding = null;
        }
        activityFullProfileBinding.achievementGroupList.setLayoutManager(gridLayoutManager);
        ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
        if (activityFullProfileBinding3 == null) {
            qc.q.z("binding");
            activityFullProfileBinding3 = null;
        }
        activityFullProfileBinding3.achievementGroupList.setAdapter(achievementProfileAdapter);
        ActivityFullProfileBinding activityFullProfileBinding4 = this.binding;
        if (activityFullProfileBinding4 == null) {
            qc.q.z("binding");
        } else {
            activityFullProfileBinding2 = activityFullProfileBinding4;
        }
        activityFullProfileBinding2.achievementGroupList.setState(RecyclerViewState.DISPLAYING_DATA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int fillAchievements$lambda$10(pc.p pVar, Object obj, Object obj2) {
        qc.q.i(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final float getFloorValue(float f10, boolean z10) {
        if (z10) {
            return (float) Math.floor(f10);
        }
        return f10;
    }

    private final String getFloorValueString(float f10, boolean z10) {
        boolean z11;
        if (z10) {
            return String.valueOf(Math.floor(f10));
        }
        if (f10 == 0.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return "0";
        }
        return String.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotCostume(List<? extends Equipment> list) {
        ActivityFullProfileBinding activityFullProfileBinding = this.binding;
        if (activityFullProfileBinding == null) {
            qc.q.z("binding");
            activityFullProfileBinding = null;
        }
        activityFullProfileBinding.costumeTableLayout.removeAllViews();
        for (Equipment equipment : list) {
            ActivityFullProfileBinding activityFullProfileBinding2 = this.binding;
            if (activityFullProfileBinding2 == null) {
                qc.q.z("binding");
                activityFullProfileBinding2 = null;
            }
            TableLayout tableLayout = activityFullProfileBinding2.costumeTableLayout;
            qc.q.h(tableLayout, "costumeTableLayout");
            addEquipmentRow(tableLayout, equipment.getKey(), equipment.getText(), "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotGear(List<? extends Equipment> list, Member member) {
        List<UserStatComputer.StatsRow> computeClassBonus = new UserStatComputer().computeClassBonus(list, member);
        ActivityFullProfileBinding activityFullProfileBinding = this.binding;
        if (activityFullProfileBinding == null) {
            qc.q.z("binding");
            activityFullProfileBinding = null;
        }
        activityFullProfileBinding.equipmentTableLayout.removeAllViews();
        ActivityFullProfileBinding activityFullProfileBinding2 = this.binding;
        if (activityFullProfileBinding2 == null) {
            qc.q.z("binding");
            activityFullProfileBinding2 = null;
        }
        int childCount = activityFullProfileBinding2.attributesTableLayout.getChildCount();
        for (int i10 = 1; i10 < childCount; i10++) {
            ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
            if (activityFullProfileBinding3 == null) {
                qc.q.z("binding");
                activityFullProfileBinding3 = null;
            }
            View childAt = activityFullProfileBinding3.attributesTableLayout.getChildAt(i10);
            if (childAt != null && childAt.isAttachedToWindow()) {
                ActivityFullProfileBinding activityFullProfileBinding4 = this.binding;
                if (activityFullProfileBinding4 == null) {
                    qc.q.z("binding");
                    activityFullProfileBinding4 = null;
                }
                activityFullProfileBinding4.attributesTableLayout.removeViewAt(i10);
            }
        }
        addLevelAttributes(member);
        for (UserStatComputer.StatsRow statsRow : computeClassBonus) {
            if (statsRow instanceof UserStatComputer.EquipmentRow) {
                ActivityFullProfileBinding activityFullProfileBinding5 = this.binding;
                if (activityFullProfileBinding5 == null) {
                    qc.q.z("binding");
                    activityFullProfileBinding5 = null;
                }
                TableLayout tableLayout = activityFullProfileBinding5.equipmentTableLayout;
                qc.q.h(tableLayout, "equipmentTableLayout");
                UserStatComputer.EquipmentRow equipmentRow = (UserStatComputer.EquipmentRow) statsRow;
                addEquipmentRow(tableLayout, equipmentRow.getGearKey(), equipmentRow.getText(), equipmentRow.getStats());
            } else if (statsRow instanceof UserStatComputer.AttributeRow) {
                UserStatComputer.AttributeRow attributeRow = (UserStatComputer.AttributeRow) statsRow;
                String string = getString(attributeRow.getLabelId());
                qc.q.h(string, "getString(...)");
                addAttributeRow(string, attributeRow.getStrVal(), attributeRow.getIntVal(), attributeRow.getConVal(), attributeRow.getPerVal(), attributeRow.getRoundDown(), attributeRow.getSummary());
            }
        }
        Stats stats = member.getStats();
        if (stats != null) {
            addNormalAddBuffAttributes(stats);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMyProfile() {
        return qc.q.d(getSharedPrefs().getString("UserID", ""), this.userID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserBlocked() {
        return this.blocks.contains(this.userID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dd.g<List<Equipment>> loadItemDataByOutfit(Outfit outfit) {
        ArrayList arrayList = new ArrayList();
        if (outfit != null) {
            arrayList.add(outfit.getArmor());
            arrayList.add(outfit.getBack());
            arrayList.add(outfit.getBody());
            arrayList.add(outfit.getEyeWear());
            arrayList.add(outfit.getHead());
            arrayList.add(outfit.getHeadAccessory());
            arrayList.add(outfit.getShield());
            arrayList.add(outfit.getWeapon());
        }
        return getInventoryRepository().getEquipment(arrayList);
    }

    private final void muteUser() {
        MemberFlags flags;
        Member value = this.member.getValue();
        boolean z10 = false;
        if (value != null && (flags = value.getFlags()) != null && flags.getChatRevoked()) {
            z10 = true;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        if (z10) {
            habiticaAlertDialog.setTitle(R.string.unmute_user_confirm);
        } else {
            habiticaAlertDialog.setTitle(R.string.mute_user_confirm);
        }
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, true, false, (pc.p) new FullProfileActivity$muteUser$1(this, z10), 8, (Object) null);
        habiticaAlertDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(FullProfileActivity fullProfileActivity, View view) {
        qc.q.i(fullProfileActivity, "this$0");
        fullProfileActivity.toggleAttributeDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(FullProfileActivity fullProfileActivity, View view) {
        qc.q.i(fullProfileActivity, "this$0");
        fullProfileActivity.showSendMessageToUserDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(FullProfileActivity fullProfileActivity, View view) {
        qc.q.i(fullProfileActivity, "this$0");
        MainNavigationController.INSTANCE.navigate(R.id.giftGemsActivity, androidx.core.os.e.a(new dc.l("userID", fullProfileActivity.userID), new dc.l("username", null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(FullProfileActivity fullProfileActivity, View view) {
        qc.q.i(fullProfileActivity, "this$0");
        MainNavigationController.INSTANCE.navigate(R.id.giftSubscriptionActivity, androidx.core.os.e.a(new dc.l("userID", fullProfileActivity.userID), new dc.l("username", null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(boolean r5, kotlin.coroutines.Continuation<? super dc.w> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.activities.FullProfileActivity$refresh$1
            if (r0 == 0) goto L13
            r0 = r6
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity$refresh$1 r0 = (com.habitrpg.android.habitica.ui.activities.FullProfileActivity$refresh$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity$refresh$1 r0 = new com.habitrpg.android.habitica.ui.activities.FullProfileActivity$refresh$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r5 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity r0 = (com.habitrpg.android.habitica.ui.activities.FullProfileActivity) r0
            dc.n.b(r6)
            goto L4e
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            dc.n.b(r6)
            com.habitrpg.android.habitica.data.SocialRepository r6 = r4.getSocialRepository()
            java.lang.String r2 = r4.userID
            r0.L$0 = r4
            r0.Z$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.retrieveMember(r2, r5, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.habitrpg.android.habitica.models.members.Member r6 = (com.habitrpg.android.habitica.models.members.Member) r6
            if (r6 == 0) goto L76
            if (r5 != 0) goto L76
            r0.updateView(r6)
            j0.j1<com.habitrpg.android.habitica.models.members.Member> r5 = r0.member
            r5.setValue(r6)
            boolean r5 = r0.isMyProfile()
            if (r5 == 0) goto L7b
            int r5 = r6.getLoginIncentives()
            r1 = 10
            if (r5 <= r1) goto L7b
            com.habitrpg.android.habitica.helpers.ReviewManager r5 = r0.getReviewManager()
            int r6 = r6.getLoginIncentives()
            r5.requestReview(r0, r6)
            goto L7b
        L76:
            if (r6 == 0) goto L7b
            r0.updateAccountStatus(r6)
        L7b:
            dc.w r5 = dc.w.f13270a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.FullProfileActivity.refresh(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void shadowMuteUser() {
        MemberFlags flags;
        Member value = this.member.getValue();
        boolean z10 = false;
        if (value != null && (flags = value.getFlags()) != null && flags.getChatShadowMuted()) {
            z10 = true;
        }
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        if (z10) {
            habiticaAlertDialog.setTitle(R.string.unshadowmute_user_confirm);
        } else {
            habiticaAlertDialog.setTitle(R.string.shadowmute_user_confirm);
        }
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.yes, true, true, false, (pc.p) new FullProfileActivity$shadowMuteUser$1(this, z10), 8, (Object) null);
        habiticaAlertDialog.show();
    }

    private final void showBlockDialog() {
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(getString(R.string.block_user_title, this.userDisplayName));
        habiticaAlertDialog.setMessage(R.string.block_user_description);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.block, true, true, false, (pc.p) new FullProfileActivity$showBlockDialog$1(this), 8, (Object) null);
        AlertDialogExtensionsKt.addCancelButton$default(habiticaAlertDialog, false, null, 3, null);
        habiticaAlertDialog.show();
    }

    private final void showReportUserBottomSheet(String str, String str2, String str3) {
        ReportBottomSheetFragment.Companion companion = ReportBottomSheetFragment.Companion;
        String a10 = qc.g0.b(FullProfileActivity.class).a();
        if (a10 == null) {
            a10 = "";
        }
        companion.newInstance(ReportBottomSheetFragment.REPORT_TYPE_USER, str2, str3, str, "", "", "", a10).show(getSupportFragmentManager(), ReportBottomSheetFragment.TAG);
    }

    private final void showSendMessageToUserDialog() {
        finish();
        ad.i.d(ad.l0.b(), ad.a1.c(), null, new FullProfileActivity$showSendMessageToUserDialog$1(this, null), 2, null);
    }

    private final void toggleAttributeDetails() {
        int i10;
        int i11;
        this.attributeDetailsHidden = !this.attributeDetailsHidden;
        ActivityFullProfileBinding activityFullProfileBinding = this.binding;
        if (activityFullProfileBinding == null) {
            qc.q.z("binding");
            activityFullProfileBinding = null;
        }
        AppCompatImageView appCompatImageView = activityFullProfileBinding.attributesCollapseIcon;
        if (this.attributeDetailsHidden) {
            i10 = R.drawable.ic_keyboard_arrow_right_black_24dp;
        } else {
            i10 = R.drawable.ic_keyboard_arrow_down_black_24dp;
        }
        appCompatImageView.setImageDrawable(androidx.core.content.a.e(this, i10));
        Iterator<TableRow> it = this.attributeRows.iterator();
        while (it.hasNext()) {
            TableRow next = it.next();
            if (this.attributeDetailsHidden) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            next.setVisibility(i11);
        }
    }

    private final void updateAccountStatus(Member member) {
        boolean z10;
        boolean z11;
        String k02;
        ArrayList arrayList = new ArrayList();
        Authentication authentication = member.getAuthentication();
        boolean z12 = false;
        if (authentication != null && authentication.getBlocked()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add("Banned");
        }
        MemberFlags flags = member.getFlags();
        if (flags != null && flags.getChatShadowMuted()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            arrayList.add("Shadow Muted");
        }
        MemberFlags flags2 = member.getFlags();
        if (flags2 != null && flags2.getChatRevoked()) {
            z12 = true;
        }
        if (z12) {
            arrayList.add("Muted");
        }
        ActivityFullProfileBinding activityFullProfileBinding = null;
        if ((!arrayList.isEmpty()) != false) {
            ActivityFullProfileBinding activityFullProfileBinding2 = this.binding;
            if (activityFullProfileBinding2 == null) {
                qc.q.z("binding");
                activityFullProfileBinding2 = null;
            }
            TextView textView = activityFullProfileBinding2.adminStatusTextview;
            k02 = ec.b0.k0(arrayList, ", ", null, null, 0, null, null, 62, null);
            textView.setText(k02);
            ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
            if (activityFullProfileBinding3 == null) {
                qc.q.z("binding");
            } else {
                activityFullProfileBinding = activityFullProfileBinding3;
            }
            activityFullProfileBinding.adminStatusTextview.setTextColor(androidx.core.content.a.c(this, R.color.text_red));
            return;
        }
        ActivityFullProfileBinding activityFullProfileBinding4 = this.binding;
        if (activityFullProfileBinding4 == null) {
            qc.q.z("binding");
            activityFullProfileBinding4 = null;
        }
        activityFullProfileBinding4.adminStatusTextview.setText(getString(R.string.regular_access));
        ActivityFullProfileBinding activityFullProfileBinding5 = this.binding;
        if (activityFullProfileBinding5 == null) {
            qc.q.z("binding");
        } else {
            activityFullProfileBinding = activityFullProfileBinding5;
        }
        activityFullProfileBinding.adminStatusTextview.setTextColor(androidx.core.content.a.c(this, R.color.text_green));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updatePetsMountsView(com.habitrpg.android.habitica.models.members.Member r10) {
        /*
            r9 = this;
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r0 = r9.binding
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 != 0) goto Lb
            qc.q.z(r1)
            r0 = r2
        Lb:
            android.widget.TextView r0 = r0.petsFoundCount
            int r3 = r10.getPetsFoundCount()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setText(r3)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r0 = r9.binding
            if (r0 != 0) goto L20
            qc.q.z(r1)
            r0 = r2
        L20:
            android.widget.TextView r0 = r0.mountsTamedCount
            int r3 = r10.getMountsTamedCount()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.setText(r3)
            java.lang.String r0 = r10.getCurrentPet()
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L3e
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r4
            if (r0 != r4) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            r5 = 2
            if (r0 == 0) goto L69
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r0 = r9.binding
            if (r0 != 0) goto L4a
            qc.q.z(r1)
            r0 = r2
        L4a:
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.currentPetDrawee
            java.lang.String r6 = "currentPetDrawee"
            qc.q.h(r0, r6)
            java.lang.String r6 = r10.getCurrentPet()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Pet-"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.habitrpg.common.habitica.extensions.DataBindingUtilsKt.loadImage$default(r0, r6, r2, r5, r2)
        L69:
            java.lang.String r0 = r10.getCurrentMount()
            if (r0 == 0) goto L77
            boolean r0 = yc.m.u(r0)
            r0 = r0 ^ r4
            if (r0 != r4) goto L77
            r3 = 1
        L77:
            if (r3 == 0) goto La0
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r0 = r9.binding
            if (r0 != 0) goto L81
            qc.q.z(r1)
            r0 = r2
        L81:
            com.habitrpg.common.habitica.views.PixelArtView r0 = r0.currentMountDrawee
            java.lang.String r1 = "currentMountDrawee"
            qc.q.h(r0, r1)
            java.lang.String r10 = r10.getCurrentMount()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Mount_Icon_"
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.habitrpg.common.habitica.extensions.DataBindingUtilsKt.loadImage$default(r0, r10, r2, r5, r2)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.FullProfileActivity.updatePetsMountsView(com.habitrpg.android.habitica.models.members.Member):void");
    }

    private final void updateView(Member member) {
        boolean z10;
        boolean z11;
        AuthenticationTimestamps timestamps;
        Date lastLoggedIn;
        AuthenticationTimestamps timestamps2;
        Date createdAt;
        Profile profile = member.getProfile();
        if (profile == null) {
            return;
        }
        updatePetsMountsView(member);
        this.userDisplayName = profile.getName();
        this.username = member.getUsername();
        setTitle(profile.getName());
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(member.getFormattedUsername());
        }
        String imageUrl = profile.getImageUrl();
        boolean z12 = false;
        if (imageUrl != null && imageUrl.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ActivityFullProfileBinding activityFullProfileBinding = this.binding;
            if (activityFullProfileBinding == null) {
                qc.q.z("binding");
                activityFullProfileBinding = null;
            }
            activityFullProfileBinding.profileImage.setVisibility(8);
        }
        String blurb = profile.getBlurb();
        if (blurb != null && blurb.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            ActivityFullProfileBinding activityFullProfileBinding2 = this.binding;
            if (activityFullProfileBinding2 == null) {
                qc.q.z("binding");
                activityFullProfileBinding2 = null;
            }
            TextView textView = activityFullProfileBinding2.blurbTextView;
            qc.q.h(textView, "blurbTextView");
            MarkdownParserKt.setMarkdown(textView, blurb);
            ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
            if (activityFullProfileBinding3 == null) {
                qc.q.z("binding");
                activityFullProfileBinding3 = null;
            }
            activityFullProfileBinding3.blurbTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        Authentication authentication = member.getAuthentication();
        if (authentication != null && (timestamps2 = authentication.getTimestamps()) != null && (createdAt = timestamps2.getCreatedAt()) != null) {
            ActivityFullProfileBinding activityFullProfileBinding4 = this.binding;
            if (activityFullProfileBinding4 == null) {
                qc.q.z("binding");
                activityFullProfileBinding4 = null;
            }
            activityFullProfileBinding4.joinedView.setText(this.dateFormatter.format(createdAt));
        }
        Authentication authentication2 = member.getAuthentication();
        if (authentication2 != null && (timestamps = authentication2.getTimestamps()) != null && (lastLoggedIn = timestamps.getLastLoggedIn()) != null) {
            ActivityFullProfileBinding activityFullProfileBinding5 = this.binding;
            if (activityFullProfileBinding5 == null) {
                qc.q.z("binding");
                activityFullProfileBinding5 = null;
            }
            activityFullProfileBinding5.lastLoginView.setText(this.dateFormatter.format(lastLoggedIn));
        }
        ActivityFullProfileBinding activityFullProfileBinding6 = this.binding;
        if (activityFullProfileBinding6 == null) {
            qc.q.z("binding");
            activityFullProfileBinding6 = null;
        }
        activityFullProfileBinding6.totalCheckinsView.setText(String.valueOf(member.getLoginIncentives()));
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new FullProfileActivity$updateView$3(this, member, null), 1, null);
        MemberPreferences preferences = member.getPreferences();
        if (preferences != null && preferences.getCostume()) {
            z12 = true;
        }
        if (z12) {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new FullProfileActivity$updateView$4(this, member, null), 1, null);
        } else {
            ActivityFullProfileBinding activityFullProfileBinding7 = this.binding;
            if (activityFullProfileBinding7 == null) {
                qc.q.z("binding");
                activityFullProfileBinding7 = null;
            }
            activityFullProfileBinding7.costumeCard.setVisibility(8);
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new FullProfileActivity$updateView$5(this, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useBlock() {
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new FullProfileActivity$useBlock$1(this, null), 1, null);
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("apiClient");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityFullProfileBinding inflate = ActivityFullProfileBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        LinearLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_full_profile);
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        qc.q.z("reviewManager");
        return null;
    }

    public final SharedPreferences getSharedPrefs() {
        SharedPreferences sharedPreferences = this.sharedPrefs;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPrefs");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6 = yc.w.n0(r6, "/profile/");
     */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            java.lang.String r0 = "binding"
            r1 = 0
            if (r6 != 0) goto Le
            qc.q.z(r0)
            r6 = r1
        Le:
            androidx.appcompat.widget.Toolbar r6 = r6.toolbar
            r5.setupToolbar(r6)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r2 = ""
            if (r6 == 0) goto L28
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L28
            java.lang.String r3 = "userID"
            java.lang.String r6 = r6.getString(r3, r2)
            goto L29
        L28:
            r6 = r1
        L29:
            if (r6 != 0) goto L2c
            r6 = r2
        L2c:
            r5.userID = r6
            int r6 = r6.length()
            r3 = 1
            if (r6 != 0) goto L37
            r6 = 1
            goto L38
        L37:
            r6 = 0
        L38:
            if (r6 == 0) goto L58
            android.content.Intent r6 = r5.getIntent()
            if (r6 == 0) goto L56
            android.net.Uri r6 = r6.getData()
            if (r6 == 0) goto L56
            java.lang.String r6 = r6.getPath()
            if (r6 == 0) goto L56
            java.lang.String r4 = "/profile/"
            java.lang.String r6 = yc.m.n0(r6, r4)
            if (r6 != 0) goto L55
            goto L56
        L55:
            r2 = r6
        L56:
            r5.userID = r2
        L58:
            r6 = 2131952847(0x7f1304cf, float:1.9542148E38)
            r5.setTitle(r6)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            if (r6 != 0) goto L66
            qc.q.z(r0)
            r6 = r1
        L66:
            androidx.compose.ui.platform.ComposeView r6 = r6.avatarWithBars
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$1 r2 = new com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$1
            r2.<init>(r5)
            r4 = -1881839356(0xffffffff8fd56904, float:-2.1043872E-29)
            q0.a r2 = q0.c.c(r4, r3, r2)
            r6.setContent(r2)
            java.util.ArrayList<android.widget.TableRow> r6 = r5.attributeRows
            r6.clear()
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            if (r6 != 0) goto L84
            qc.q.z(r0)
            r6 = r1
        L84:
            android.widget.FrameLayout r6 = r6.attributesCardView
            com.habitrpg.android.habitica.ui.activities.i0 r2 = new com.habitrpg.android.habitica.ui.activities.i0
            r2.<init>()
            r6.setOnClickListener(r2)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            if (r6 != 0) goto L96
            qc.q.z(r0)
            r6 = r1
        L96:
            android.widget.Button r6 = r6.sendMessageButton
            com.habitrpg.android.habitica.ui.activities.j0 r2 = new com.habitrpg.android.habitica.ui.activities.j0
            r2.<init>()
            r6.setOnClickListener(r2)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            if (r6 != 0) goto La8
            qc.q.z(r0)
            r6 = r1
        La8:
            android.widget.Button r6 = r6.giftGemsButton
            com.habitrpg.android.habitica.ui.activities.k0 r2 = new com.habitrpg.android.habitica.ui.activities.k0
            r2.<init>()
            r6.setOnClickListener(r2)
            com.habitrpg.android.habitica.databinding.ActivityFullProfileBinding r6 = r5.binding
            if (r6 != 0) goto Lba
            qc.q.z(r0)
            r6 = r1
        Lba:
            android.widget.Button r6 = r6.giftSubscriptionButton
            com.habitrpg.android.habitica.ui.activities.l0 r0 = new com.habitrpg.android.habitica.ui.activities.l0
            r0.<init>()
            r6.setOnClickListener(r0)
            androidx.lifecycle.q r6 = androidx.lifecycle.w.a(r5)
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6 r0 = new com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$6
            r0.<init>(r5, r1)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r6, r1, r0, r3, r1)
            androidx.lifecycle.q r6 = androidx.lifecycle.w.a(r5)
            com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$7 r0 = new com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$7
            r0.<init>(r5, r1)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r6, r1, r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.FullProfileActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        int i10;
        MemberFlags flags;
        boolean z10;
        int i11;
        MemberFlags flags2;
        boolean z11;
        int i12;
        Authentication authentication;
        qc.q.i(menu, "menu");
        MenuInflater menuInflater = getMenuInflater();
        qc.q.h(menuInflater, "getMenuInflater(...)");
        menuInflater.inflate(R.menu.menu_full_profile, menu);
        boolean z12 = true;
        androidx.core.view.t.a(menu, true);
        MenuItem findItem = menu.findItem(R.id.block_user);
        MenuItem findItem2 = menu.findItem(R.id.share_avatar);
        if (isMyProfile()) {
            findItem.setVisible(false);
            findItem2.setVisible(true);
        } else {
            findItem.setVisible(true);
            findItem2.setVisible(false);
        }
        if (isUserBlocked()) {
            if (findItem != null) {
                findItem.setTitle(getString(R.string.unblock_user));
            }
        } else if (findItem != null) {
            findItem.setTitle(getString(R.string.block));
        }
        menu.setGroupVisible(R.id.admin_items, this.isModerator);
        if (this.isModerator || this.isUserSupport) {
            MenuItem findItem3 = menu.findItem(R.id.ban_user);
            if (findItem3 != null) {
                Member value = this.member.getValue();
                if (value != null && (authentication = value.getAuthentication()) != null && authentication.getBlocked()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i12 = R.string.unban_user;
                } else {
                    i12 = R.string.ban_user;
                }
                findItem3.setTitle(getString(i12));
            }
            MenuItem findItem4 = menu.findItem(R.id.shadow_mute_user);
            if (findItem4 != null) {
                Member value2 = this.member.getValue();
                if (value2 != null && (flags2 = value2.getFlags()) != null && flags2.getChatShadowMuted()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i11 = R.string.unshadowmute_user;
                } else {
                    i11 = R.string.shadow_mute_user;
                }
                findItem4.setTitle(getString(i11));
            }
            MenuItem findItem5 = menu.findItem(R.id.mute_user);
            if (findItem5 != null) {
                Member value3 = this.member.getValue();
                if (value3 == null || (flags = value3.getFlags()) == null || !flags.getChatRevoked()) {
                    z12 = false;
                }
                if (z12) {
                    i10 = R.string.unmute_user;
                } else {
                    i10 = R.string.mute_user;
                }
                findItem5.setTitle(getString(i10));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.appcompat.app.d, androidx.fragment.app.q, android.app.Activity
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        ClipboardManager clipboardManager;
        ClipboardManager clipboardManager2;
        qc.q.i(menuItem, "item");
        ActivityFullProfileBinding activityFullProfileBinding = null;
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            case R.id.ban_user /* 2131296436 */:
                banUser();
                return true;
            case R.id.block_user /* 2131296449 */:
                if (this.blocks.contains(this.userID)) {
                    useBlock();
                    return true;
                }
                showBlockDialog();
                return true;
            case R.id.copy_userid /* 2131296609 */:
                Object systemService = getSystemService("clipboard");
                if (systemService instanceof ClipboardManager) {
                    clipboardManager = (ClipboardManager) systemService;
                } else {
                    clipboardManager = null;
                }
                String str = this.userID;
                ClipData newPlainText = ClipData.newPlainText(str, str);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(newPlainText);
                }
                if (Build.VERSION.SDK_INT > 32) {
                    return true;
                }
                HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
                ActivityFullProfileBinding activityFullProfileBinding2 = this.binding;
                if (activityFullProfileBinding2 == null) {
                    qc.q.z("binding");
                } else {
                    activityFullProfileBinding = activityFullProfileBinding2;
                }
                View childAt = activityFullProfileBinding.scrollView.getChildAt(0);
                qc.q.g(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup = (ViewGroup) childAt;
                qc.j0 j0Var = qc.j0.f21683a;
                String string = getString(R.string.id_copied);
                qc.q.h(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{this.userDisplayName}, 1));
                qc.q.h(format, "format(format, *args)");
                companion.showSnackbar(viewGroup, format, HabiticaSnackbar.SnackbarDisplayType.NORMAL, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
                return true;
            case R.id.copy_username /* 2131296610 */:
                Object systemService2 = getSystemService("clipboard");
                if (systemService2 instanceof ClipboardManager) {
                    clipboardManager2 = (ClipboardManager) systemService2;
                } else {
                    clipboardManager2 = null;
                }
                String str2 = this.username;
                ClipData newPlainText2 = ClipData.newPlainText(str2, str2);
                if (clipboardManager2 != null) {
                    clipboardManager2.setPrimaryClip(newPlainText2);
                }
                if (Build.VERSION.SDK_INT > 32) {
                    return true;
                }
                HabiticaSnackbar.Companion companion2 = HabiticaSnackbar.Companion;
                ActivityFullProfileBinding activityFullProfileBinding3 = this.binding;
                if (activityFullProfileBinding3 == null) {
                    qc.q.z("binding");
                } else {
                    activityFullProfileBinding = activityFullProfileBinding3;
                }
                View childAt2 = activityFullProfileBinding.scrollView.getChildAt(0);
                qc.q.g(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) childAt2;
                qc.j0 j0Var2 = qc.j0.f21683a;
                String string2 = getString(R.string.username_copied);
                qc.q.h(string2, "getString(...)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{this.userDisplayName}, 1));
                qc.q.h(format2, "format(format, *args)");
                companion2.showSnackbar(viewGroup2, format2, HabiticaSnackbar.SnackbarDisplayType.NORMAL, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
                return true;
            case R.id.mute_user /* 2131297115 */:
                muteUser();
                return true;
            case R.id.report_player /* 2131297365 */:
                String str3 = this.userID;
                String str4 = this.username;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                String str6 = this.userDisplayName;
                if (str6 != null) {
                    str5 = str6;
                }
                showReportUserBottomSheet(str3, str4, str5);
                return true;
            case R.id.shadow_mute_user /* 2131297464 */:
                shadowMuteUser();
                return true;
            case R.id.share_avatar /* 2131297465 */:
                Member value = this.member.getValue();
                if (value == null) {
                    return true;
                }
                ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new FullProfileActivity$onOptionsItemSelected$1$1(new ShareAvatarUseCase(), this, value, null), 1, null);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public final void setApiClient(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        qc.q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    private final void fillAchievements(int i10, List<? extends Achievement> list, List<Object> list2) {
        ArrayList arrayList = new ArrayList(list);
        final FullProfileActivity$fillAchievements$5 fullProfileActivity$fillAchievements$5 = FullProfileActivity$fillAchievements$5.INSTANCE;
        ec.x.v(arrayList, new Comparator() { // from class: com.habitrpg.android.habitica.ui.activities.m0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int fillAchievements$lambda$10;
                fillAchievements$lambda$10 = FullProfileActivity.fillAchievements$lambda$10(pc.p.this, obj, obj2);
                return fillAchievements$lambda$10;
            }
        });
        Object string = getString(i10);
        qc.q.h(string, "getString(...)");
        list2.add(string);
        list2.addAll(arrayList);
    }
}
