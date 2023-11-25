package com.habitrpg.android.habitica.ui.fragments;

import ad.a1;
import ad.x1;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.MainNavDirections;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.DrawerMainBinding;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.models.promotions.HabiticaPromotion;
import com.habitrpg.android.habitica.models.promotions.PromoType;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.NotificationsActivity;
import com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter;
import com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.NotificationsViewModel;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MainNavigationController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import qc.f0;

/* compiled from: NavigationDrawerFragment.kt */
/* loaded from: classes4.dex */
public final class NavigationDrawerFragment extends Hilt_NavigationDrawerFragment {
    public static final String SIDEBAR_ABOUT = "about";
    public static final String SIDEBAR_ABOUT_HEADER = "about_header";
    public static final String SIDEBAR_ACHIEVEMENTS = "achievements";
    public static final String SIDEBAR_AVATAR = "avatar";
    public static final String SIDEBAR_BIRTHDAY = "birthday";
    public static final String SIDEBAR_CHALLENGES = "challenges";
    public static final String SIDEBAR_EQUIPMENT = "equipment";
    public static final String SIDEBAR_GEMS = "gems";
    public static final String SIDEBAR_HELP = "help";
    public static final String SIDEBAR_INVENTORY = "inventory";
    public static final String SIDEBAR_ITEMS = "items";
    public static final String SIDEBAR_NEWS = "news";
    public static final String SIDEBAR_PARTY = "party";
    public static final String SIDEBAR_PROMO = "promo";
    public static final String SIDEBAR_SHOPS_MARKET = "market";
    public static final String SIDEBAR_SHOPS_QUEST = "questShop";
    public static final String SIDEBAR_SHOPS_SEASONAL = "seasonalShop";
    public static final String SIDEBAR_SHOPS_TIMETRAVEL = "timeTravelersShop";
    public static final String SIDEBAR_SKILLS = "skills";
    public static final String SIDEBAR_SOCIAL = "social";
    public static final String SIDEBAR_STABLE = "stable";
    public static final String SIDEBAR_STATS = "stats";
    public static final String SIDEBAR_SUBSCRIPTION = "subscription";
    public static final String SIDEBAR_SUBSCRIPTION_PROMO = "subscriptionpromo";
    public static final String SIDEBAR_TASKS = "tasks";
    private static final String STATE_SELECTED_POSITION = "selected_navigation_drawer_position";
    private HabiticaPromotion activePromo;
    private NavigationDrawerAdapter adapter;
    private DrawerMainBinding binding;
    public AppConfigManager configManager;
    public ContentRepository contentRepository;
    private DrawerLayout drawerLayout;
    private View fragmentContainerView;
    public InventoryRepository inventoryRepository;
    private boolean isTabletUI;
    private int mCurrentSelectedPosition;
    private boolean mFromSavedInstanceState;
    private final androidx.activity.result.b<Intent> notificationClickResult;
    public SharedPreferences sharedPreferences;
    public SocialRepository socialRepository;
    private Map<String, x1> updatingJobs = new LinkedHashMap();
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NavigationDrawerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    public NavigationDrawerFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new f.d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.o
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                NavigationDrawerFragment.notificationClickResult$lambda$9(NavigationDrawerFragment.this, (ActivityResult) obj);
            }
        });
        qc.q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.notificationClickResult = registerForActivityResult;
    }

    public final void createUpdatingJob(String str, pc.a<Boolean> aVar, pc.a<zc.a> aVar2, pc.a<dc.w> aVar3) {
        x1 d10;
        x1 x1Var;
        aVar3.invoke();
        x1 x1Var2 = this.updatingJobs.get(str);
        boolean z10 = false;
        if (x1Var2 != null && x1Var2.b()) {
            z10 = true;
        }
        if (z10 && (x1Var = this.updatingJobs.get(str)) != null) {
            x1.a.a(x1Var, null, 1, null);
        }
        Map<String, x1> map = this.updatingJobs;
        d10 = ad.i.d(androidx.lifecycle.w.a(this), a1.c(), null, new NavigationDrawerFragment$createUpdatingJob$1(aVar, aVar3, aVar2, null), 2, null);
        map.put(str, d10);
    }

    public final HabiticaDrawerItem getItemWithIdentifier(String str) {
        NavigationDrawerAdapter navigationDrawerAdapter = this.adapter;
        if (navigationDrawerAdapter == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter = null;
        }
        return navigationDrawerAdapter.getItemWithIdentifier(str);
    }

    private final void initializeMenuItems() {
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        if (context != null) {
            int i10 = R.id.tasksFragment;
            String str = SIDEBAR_TASKS;
            String string = context.getString(R.string.sidebar_tasks);
            qc.q.h(string, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i10, str, string, null, false, 24, null));
            int i11 = R.id.skillsFragment;
            String str2 = SIDEBAR_SKILLS;
            String string2 = context.getString(R.string.sidebar_skills);
            qc.q.h(string2, "getString(...)");
            Drawable drawable = null;
            boolean z10 = false;
            int i12 = 24;
            qc.h hVar = null;
            arrayList.add(new HabiticaDrawerItem(i11, str2, string2, drawable, z10, i12, hVar));
            int i13 = R.id.statsFragment;
            String str3 = SIDEBAR_STATS;
            String string3 = context.getString(R.string.sidebar_stats);
            qc.q.h(string3, "getString(...)");
            Drawable drawable2 = null;
            qc.h hVar2 = null;
            arrayList.add(new HabiticaDrawerItem(i13, str3, string3, drawable2, false, 24, hVar2));
            int i14 = R.id.achievementsFragment;
            String str4 = SIDEBAR_ACHIEVEMENTS;
            String string4 = context.getString(R.string.sidebar_achievements);
            qc.q.h(string4, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i14, str4, string4, drawable, z10, i12, hVar));
            String str5 = SIDEBAR_INVENTORY;
            String string5 = context.getString(R.string.sidebar_shops);
            qc.q.h(string5, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(0, str5, string5, drawable2, true, 8, hVar2));
            String string6 = context.getString(R.string.market);
            qc.q.h(string6, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(R.id.marketFragment, "market", string6, drawable, z10, i12, hVar));
            String string7 = context.getString(R.string.questShop);
            qc.q.h(string7, "getString(...)");
            boolean z11 = false;
            int i15 = 24;
            arrayList.add(new HabiticaDrawerItem(R.id.questShopFragment, "questShop", string7, drawable2, z11, i15, hVar2));
            String string8 = context.getString(R.string.seasonalShop);
            qc.q.h(string8, "getString(...)");
            HabiticaDrawerItem habiticaDrawerItem = new HabiticaDrawerItem(R.id.seasonalShopFragment, "seasonalShop", string8, drawable, z10, i12, hVar);
            habiticaDrawerItem.setVisible(false);
            arrayList.add(habiticaDrawerItem);
            String string9 = context.getString(R.string.timeTravelers);
            qc.q.h(string9, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(R.id.timeTravelersShopFragment, "timeTravelersShop", string9, drawable2, z11, i15, hVar2));
            String str6 = SIDEBAR_INVENTORY;
            String string10 = context.getString(R.string.sidebar_section_inventory);
            qc.q.h(string10, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(0, str6, string10, drawable, true, 8, hVar));
            int i16 = R.id.avatarOverviewFragment;
            String str7 = SIDEBAR_AVATAR;
            String string11 = context.getString(R.string.sidebar_avatar);
            qc.q.h(string11, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i16, str7, string11, drawable2, z11, i15, hVar2));
            int i17 = R.id.equipmentOverviewFragment;
            String str8 = SIDEBAR_EQUIPMENT;
            String string12 = context.getString(R.string.sidebar_equipment);
            qc.q.h(string12, "getString(...)");
            boolean z12 = false;
            int i18 = 24;
            arrayList.add(new HabiticaDrawerItem(i17, str8, string12, drawable, z12, i18, hVar));
            int i19 = R.id.itemsFragment;
            String str9 = SIDEBAR_ITEMS;
            String string13 = context.getString(R.string.sidebar_items);
            qc.q.h(string13, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i19, str9, string13, drawable2, z11, i15, hVar2));
            int i20 = R.id.stableFragment;
            String str10 = SIDEBAR_STABLE;
            String string14 = context.getString(R.string.sidebar_stable);
            qc.q.h(string14, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i20, str10, string14, drawable, z12, i18, hVar));
            int i21 = R.id.gemPurchaseActivity;
            String str11 = SIDEBAR_GEMS;
            String string15 = context.getString(R.string.sidebar_gems);
            qc.q.h(string15, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i21, str11, string15, drawable2, z11, i15, hVar2));
            int i22 = R.id.subscriptionPurchaseActivity;
            String str12 = SIDEBAR_SUBSCRIPTION;
            String string16 = context.getString(R.string.sidebar_subscription);
            qc.q.h(string16, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i22, str12, string16, drawable, z12, i18, hVar));
            String str13 = SIDEBAR_SOCIAL;
            String string17 = context.getString(R.string.sidebar_section_social);
            qc.q.h(string17, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(0, str13, string17, drawable2, true, 8, hVar2));
            int i23 = R.id.partyFragment;
            String str14 = SIDEBAR_PARTY;
            String string18 = context.getString(R.string.sidebar_party);
            qc.q.h(string18, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i23, str14, string18, drawable, z12, i18, hVar));
            if (!getConfigManager().hideChallenges()) {
                int i24 = R.id.challengesOverviewFragment;
                String str15 = SIDEBAR_CHALLENGES;
                String string19 = context.getString(R.string.sidebar_challenges);
                qc.q.h(string19, "getString(...)");
                arrayList.add(new HabiticaDrawerItem(i24, str15, string19, null, false, 24, null));
            }
            String str16 = SIDEBAR_ABOUT_HEADER;
            String string20 = context.getString(R.string.sidebar_about);
            qc.q.h(string20, "getString(...)");
            Drawable drawable3 = null;
            qc.h hVar3 = null;
            arrayList.add(new HabiticaDrawerItem(0, str16, string20, drawable3, true, 8, hVar3));
            int i25 = R.id.newsFragment;
            String str17 = SIDEBAR_NEWS;
            String string21 = context.getString(R.string.sidebar_news);
            qc.q.h(string21, "getString(...)");
            Drawable drawable4 = null;
            boolean z13 = false;
            int i26 = 24;
            qc.h hVar4 = null;
            arrayList.add(new HabiticaDrawerItem(i25, str17, string21, drawable4, z13, i26, hVar4));
            int i27 = R.id.supportMainFragment;
            String str18 = SIDEBAR_HELP;
            String string22 = context.getString(R.string.sidebar_help);
            qc.q.h(string22, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i27, str18, string22, drawable3, false, 24, hVar3));
            int i28 = R.id.aboutFragment;
            String str19 = SIDEBAR_ABOUT;
            String string23 = context.getString(R.string.sidebar_about);
            qc.q.h(string23, "getString(...)");
            arrayList.add(new HabiticaDrawerItem(i28, str19, string23, drawable4, z13, i26, hVar4));
        }
        HabiticaDrawerItem habiticaDrawerItem2 = new HabiticaDrawerItem(R.id.subscriptionPurchaseActivity, SIDEBAR_PROMO);
        habiticaDrawerItem2.setItemViewType(5);
        habiticaDrawerItem2.setVisible(false);
        arrayList.add(habiticaDrawerItem2);
        if (getConfigManager().showSubscriptionBanner()) {
            HabiticaDrawerItem habiticaDrawerItem3 = new HabiticaDrawerItem(R.id.subscriptionPurchaseActivity, SIDEBAR_SUBSCRIPTION_PROMO);
            habiticaDrawerItem3.setItemViewType(2);
            arrayList.add(habiticaDrawerItem3);
        }
        NavigationDrawerAdapter navigationDrawerAdapter = this.adapter;
        if (navigationDrawerAdapter == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter = null;
        }
        navigationDrawerAdapter.updateItems(arrayList);
    }

    public static final void notificationClickResult$lambda$9(NavigationDrawerFragment navigationDrawerFragment, ActivityResult activityResult) {
        MainActivity mainActivity;
        NotificationsViewModel notificationsViewModel;
        String str;
        qc.q.i(navigationDrawerFragment, "this$0");
        if (activityResult.b() == -1) {
            androidx.fragment.app.q activity = navigationDrawerFragment.getActivity();
            if (activity instanceof MainActivity) {
                mainActivity = (MainActivity) activity;
            } else {
                mainActivity = null;
            }
            if (mainActivity != null && (notificationsViewModel = mainActivity.getNotificationsViewModel()) != null) {
                Intent a10 = activityResult.a();
                if (a10 == null || (str = a10.getStringExtra("notificationId")) == null) {
                    str = "";
                }
                notificationsViewModel.click(str, MainNavigationController.INSTANCE);
            }
        }
    }

    public static final void onViewCreated$lambda$0(NavigationDrawerFragment navigationDrawerFragment, View view) {
        qc.q.i(navigationDrawerFragment, "this$0");
        navigationDrawerFragment.setSelection(Integer.valueOf((int) R.id.inboxFragment), null, true, false);
    }

    public static final void onViewCreated$lambda$1(NavigationDrawerFragment navigationDrawerFragment, View view) {
        qc.q.i(navigationDrawerFragment, "this$0");
        navigationDrawerFragment.setSelection(Integer.valueOf((int) R.id.prefsActivity), null, true, false);
    }

    public static final void onViewCreated$lambda$2(NavigationDrawerFragment navigationDrawerFragment, View view) {
        qc.q.i(navigationDrawerFragment, "this$0");
        navigationDrawerFragment.startNotificationsActivity();
    }

    private final void setDisplayName(String str) {
        boolean z10;
        TextView textView;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str2 = null;
        TextView textView2 = null;
        if (!z10) {
            DrawerMainBinding drawerMainBinding = this.binding;
            if (drawerMainBinding != null) {
                textView2 = drawerMainBinding.toolbarTitle;
            }
            if (textView2 != null) {
                textView2.setText(str);
                return;
            }
            return;
        }
        DrawerMainBinding drawerMainBinding2 = this.binding;
        if (drawerMainBinding2 != null) {
            textView = drawerMainBinding2.toolbarTitle;
        } else {
            textView = null;
        }
        if (textView != null) {
            Context context = getContext();
            if (context != null) {
                str2 = context.getString(R.string.app_name);
            }
            textView.setText(str2);
        }
    }

    private final void setMessagesCount(Inbox inbox) {
        int i10;
        TextView textView;
        TextView textView2;
        int c10;
        Drawable drawable;
        TextView textView3;
        TextView textView4;
        boolean z10 = false;
        if (inbox != null) {
            i10 = inbox.getNewMessages();
        } else {
            i10 = 0;
        }
        TextView textView5 = null;
        GradientDrawable gradientDrawable = null;
        if (i10 != 0) {
            DrawerMainBinding drawerMainBinding = this.binding;
            if (drawerMainBinding != null) {
                textView = drawerMainBinding.messagesBadge;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            DrawerMainBinding drawerMainBinding2 = this.binding;
            if (drawerMainBinding2 != null) {
                textView2 = drawerMainBinding2.messagesBadge;
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(String.valueOf(i10));
            }
            Context context = getContext();
            if (context != null) {
                if (inbox != null && inbox.getHasUserSeenInbox()) {
                    z10 = true;
                }
                if (!z10) {
                    c10 = ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent);
                } else {
                    c10 = androidx.core.content.a.c(context, R.color.gray_200);
                }
                DrawerMainBinding drawerMainBinding3 = this.binding;
                if (drawerMainBinding3 != null && (textView4 = drawerMainBinding3.messagesBadge) != null) {
                    drawable = textView4.getBackground();
                } else {
                    drawable = null;
                }
                if (drawable instanceof GradientDrawable) {
                    gradientDrawable = (GradientDrawable) drawable;
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(ColorStateList.valueOf(c10));
                }
                DrawerMainBinding drawerMainBinding4 = this.binding;
                if (drawerMainBinding4 != null && (textView3 = drawerMainBinding4.messagesBadge) != null) {
                    textView3.setTextColor(androidx.core.content.a.c(context, R.color.white));
                    return;
                }
                return;
            }
            return;
        }
        DrawerMainBinding drawerMainBinding5 = this.binding;
        if (drawerMainBinding5 != null) {
            textView5 = drawerMainBinding5.messagesBadge;
        }
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
    }

    public final void setNotificationsCount(int i10) {
        TextView textView;
        TextView textView2 = null;
        if (i10 == 0) {
            DrawerMainBinding drawerMainBinding = this.binding;
            if (drawerMainBinding != null) {
                textView2 = drawerMainBinding.notificationsBadge;
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        DrawerMainBinding drawerMainBinding2 = this.binding;
        if (drawerMainBinding2 != null) {
            textView = drawerMainBinding2.notificationsBadge;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        DrawerMainBinding drawerMainBinding3 = this.binding;
        if (drawerMainBinding3 != null) {
            textView2 = drawerMainBinding3.notificationsBadge;
        }
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
    }

    public final void setNotificationsSeen(boolean z10) {
        int themeColor;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        Context context = getContext();
        if (context != null) {
            if (z10) {
                themeColor = androidx.core.content.a.c(context, R.color.gray_200);
            } else {
                themeColor = ContextExtensionsKt.getThemeColor(context, R.attr.colorAccent);
            }
            DrawerMainBinding drawerMainBinding = this.binding;
            GradientDrawable gradientDrawable = null;
            if (drawerMainBinding != null && (textView2 = drawerMainBinding.notificationsBadge) != null) {
                drawable = textView2.getBackground();
            } else {
                drawable = null;
            }
            if (drawable instanceof GradientDrawable) {
                gradientDrawable = drawable;
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColor(ColorStateList.valueOf(themeColor));
            }
            DrawerMainBinding drawerMainBinding2 = this.binding;
            if (drawerMainBinding2 != null && (textView = drawerMainBinding2.notificationsBadge) != null) {
                textView.setTextColor(androidx.core.content.a.c(context, R.color.white));
            }
        }
    }

    public static /* synthetic */ void setSelection$default(NavigationDrawerFragment navigationDrawerFragment, Integer num, Bundle bundle, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        navigationDrawerFragment.setSelection(num, bundle, z10, z11);
    }

    private final void setSettingsCount(int i10) {
        TextView textView;
        TextView textView2 = null;
        if (i10 == 0) {
            DrawerMainBinding drawerMainBinding = this.binding;
            if (drawerMainBinding != null) {
                textView2 = drawerMainBinding.settingsBadge;
            }
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        DrawerMainBinding drawerMainBinding2 = this.binding;
        if (drawerMainBinding2 != null) {
            textView = drawerMainBinding2.settingsBadge;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        DrawerMainBinding drawerMainBinding3 = this.binding;
        if (drawerMainBinding3 != null) {
            textView2 = drawerMainBinding3.settingsBadge;
        }
        if (textView2 != null) {
            textView2.setText(String.valueOf(i10));
        }
    }

    private final void setUsername(String str) {
        TextView textView;
        DrawerMainBinding drawerMainBinding = this.binding;
        if (drawerMainBinding != null) {
            textView = drawerMainBinding.usernameTextView;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    private final void startNotificationsActivity() {
        MainActivity mainActivity;
        if (!this.isTabletUI) {
            closeDrawer();
        }
        androidx.fragment.app.q activity = getActivity();
        if (activity instanceof MainActivity) {
            mainActivity = (MainActivity) activity;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            this.notificationClickResult.a(new Intent(mainActivity, NotificationsActivity.class));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateSeasonalMenuEntries(com.habitrpg.android.habitica.models.WorldStateEvent r7, java.util.List<? extends com.habitrpg.android.habitica.models.inventory.Item> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "market"
            com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem r0 = r6.getItemWithIdentifier(r0)
            if (r0 != 0) goto L9
            return
        L9:
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L5f
            java.lang.Object r8 = ec.r.c0(r8)
            com.habitrpg.android.habitica.models.inventory.Item r8 = (com.habitrpg.android.habitica.models.inventory.Item) r8
            if (r8 == 0) goto L37
            com.habitrpg.android.habitica.models.inventory.ItemEvent r8 = r8.getEvent()
            if (r8 == 0) goto L37
            java.util.Date r8 = r8.getEnd()
            if (r8 == 0) goto L37
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            boolean r8 = r8.after(r1)
            if (r8 != r2) goto L37
            r8 = 1
            goto L38
        L37:
            r8 = 0
        L38:
            if (r8 == 0) goto L5f
            android.content.Context r8 = r6.getContext()
            if (r8 == 0) goto L48
            r1 = 2131953158(0x7f130606, float:1.954278E38)
            java.lang.String r8 = r8.getString(r1)
            goto L49
        L48:
            r8 = r4
        L49:
            r0.setPillText(r8)
            android.content.Context r8 = r6.getContext()
            if (r8 == 0) goto L5a
            r1 = 2131952465(0x7f130351, float:1.9541374E38)
            java.lang.String r8 = r8.getString(r1)
            goto L5b
        L5a:
            r8 = r4
        L5b:
            r0.setSubtitle(r8)
            goto L65
        L5f:
            r0.setPillText(r4)
            r0.setSubtitle(r4)
        L65:
            com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter r8 = r6.adapter
            java.lang.String r1 = "adapter"
            if (r8 != 0) goto L6f
            qc.q.z(r1)
            r8 = r4
        L6f:
            r8.updateItem(r0)
            java.lang.String r8 = "seasonalShop"
            com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem r8 = r6.getItemWithIdentifier(r8)
            if (r8 != 0) goto L7b
            return
        L7b:
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L89
            r5 = 2131952731(0x7f13045b, float:1.9541913E38)
            java.lang.String r0 = r0.getString(r5)
            goto L8a
        L89:
            r0 = r4
        L8a:
            r8.setPillText(r0)
            if (r7 == 0) goto L97
            boolean r0 = r7.isCurrentlyActive()
            if (r0 != r2) goto L97
            r0 = 1
            goto L98
        L97:
            r0 = 0
        L98:
            if (r0 == 0) goto Lc0
            r8.setVisible(r2)
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto Lbb
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.util.Date r7 = r7.getEnd()
            if (r7 == 0) goto Lb0
            java.lang.String r7 = com.habitrpg.android.habitica.extensions.DateExtensionsKt.getShortRemainingString(r7)
            goto Lb1
        Lb0:
            r7 = r4
        Lb1:
            r2[r3] = r7
            r7 = 2131952732(0x7f13045c, float:1.9541915E38)
            java.lang.String r7 = r0.getString(r7, r2)
            goto Lbc
        Lbb:
            r7 = r4
        Lbc:
            r8.setSubtitle(r7)
            goto Lc3
        Lc0:
            r8.setVisible(r3)
        Lc3:
            com.habitrpg.android.habitica.ui.adapter.NavigationDrawerAdapter r7 = r6.adapter
            if (r7 != 0) goto Lcb
            qc.q.z(r1)
            goto Lcc
        Lcb:
            r4 = r7
        Lcc:
            r4.updateItem(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment.updateSeasonalMenuEntries(com.habitrpg.android.habitica.models.WorldStateEvent, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateUser(final com.habitrpg.android.habitica.models.user.User r12) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment.updateUser(com.habitrpg.android.habitica.models.user.User):void");
    }

    public static final void updateUser$lambda$3(User user, View view) {
        qc.q.i(user, "$user");
        MainNavigationController mainNavigationController = MainNavigationController.INSTANCE;
        String id2 = user.getId();
        if (id2 == null) {
            id2 = "";
        }
        MainNavDirections.OpenProfileActivity openProfileActivity = MainNavDirections.openProfileActivity(id2);
        qc.q.h(openProfileActivity, "openProfileActivity(...)");
        mainNavigationController.navigate(openProfileActivity);
    }

    public final void closeDrawer() {
        View view = this.fragmentContainerView;
        if (view != null && (view.getParent() instanceof DrawerLayout)) {
            DrawerLayout drawerLayout = this.drawerLayout;
            if (drawerLayout != null) {
                drawerLayout.f(view);
            }
        } else if (view != null) {
            view.setVisibility(8);
        }
    }

    public final AppConfigManager getConfigManager() {
        AppConfigManager appConfigManager = this.configManager;
        if (appConfigManager != null) {
            return appConfigManager;
        }
        qc.q.z("configManager");
        return null;
    }

    public final ContentRepository getContentRepository() {
        ContentRepository contentRepository = this.contentRepository;
        if (contentRepository != null) {
            return contentRepository;
        }
        qc.q.z("contentRepository");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        qc.q.z("sharedPreferences");
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

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        qc.q.z("userRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    public final boolean isDrawerOpen() {
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout != null) {
            return drawerLayout.C(8388611);
        }
        return false;
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        NavigationDrawerAdapter navigationDrawerAdapter;
        Context context = getContext();
        if (context != null) {
            navigationDrawerAdapter = new NavigationDrawerAdapter(ContextExtensionsKt.getThemeColor(context, R.attr.colorPrimaryText), ContextExtensionsKt.getThemeColor(context, R.attr.colorPrimaryOffset));
        } else {
            navigationDrawerAdapter = new NavigationDrawerAdapter(0, 0);
        }
        this.adapter = navigationDrawerAdapter;
        super.onCreate(bundle);
        if (bundle != null) {
            this.mCurrentSelectedPosition = bundle.getInt(STATE_SELECTED_POSITION);
            this.mFromSavedInstanceState = true;
        }
        this.isTabletUI = getResources().getBoolean(R.bool.isTabletUI);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qc.q.i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.drawer_main, viewGroup, false);
        if (inflate instanceof ViewGroup) {
            return (ViewGroup) inflate;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getSocialRepository().close();
        getInventoryRepository().close();
        getUserRepository().close();
        Iterator<Map.Entry<String, x1>> it = this.updatingJobs.entrySet().iterator();
        while (it.hasNext()) {
            x1.a.a(it.next().getValue(), null, 1, null);
        }
        this.updatingJobs.clear();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.k, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        qc.q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt(STATE_SELECTED_POSITION, this.mCurrentSelectedPosition);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.m mVar;
        androidx.recyclerview.widget.y yVar;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        RelativeLayout relativeLayout3;
        RecyclerView recyclerView3;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        DrawerMainBinding bind = DrawerMainBinding.bind(view);
        this.binding = bind;
        if (bind != null) {
            recyclerView = bind.recyclerView;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            NavigationDrawerAdapter navigationDrawerAdapter = this.adapter;
            if (navigationDrawerAdapter == null) {
                qc.q.z("adapter");
                navigationDrawerAdapter = null;
            }
            recyclerView.setAdapter(navigationDrawerAdapter);
        }
        DrawerMainBinding drawerMainBinding = this.binding;
        if (drawerMainBinding != null) {
            recyclerView2 = drawerMainBinding.recyclerView;
        } else {
            recyclerView2 = null;
        }
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        DrawerMainBinding drawerMainBinding2 = this.binding;
        if (drawerMainBinding2 != null && (recyclerView3 = drawerMainBinding2.recyclerView) != null) {
            mVar = recyclerView3.getItemAnimator();
        } else {
            mVar = null;
        }
        if (mVar instanceof androidx.recyclerview.widget.y) {
            yVar = (androidx.recyclerview.widget.y) mVar;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            yVar.setSupportsChangeAnimations(false);
        }
        initializeMenuItems();
        NavigationDrawerAdapter navigationDrawerAdapter2 = this.adapter;
        if (navigationDrawerAdapter2 == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter2 = null;
        }
        navigationDrawerAdapter2.setItemSelectedEvents(new NavigationDrawerFragment$onViewCreated$1(this));
        NavigationDrawerAdapter navigationDrawerAdapter3 = this.adapter;
        if (navigationDrawerAdapter3 == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter3 = null;
        }
        navigationDrawerAdapter3.setPromoClosedSubject(new NavigationDrawerFragment$onViewCreated$2(this));
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NavigationDrawerFragment$onViewCreated$3(this, null), 1, null);
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new NavigationDrawerFragment$sam$androidx_lifecycle_Observer$0(new NavigationDrawerFragment$onViewCreated$4(this)));
        DrawerMainBinding drawerMainBinding3 = this.binding;
        if (drawerMainBinding3 != null && (relativeLayout3 = drawerMainBinding3.messagesButtonWrapper) != null) {
            relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NavigationDrawerFragment.onViewCreated$lambda$0(NavigationDrawerFragment.this, view2);
                }
            });
        }
        DrawerMainBinding drawerMainBinding4 = this.binding;
        if (drawerMainBinding4 != null && (relativeLayout2 = drawerMainBinding4.settingsButtonWrapper) != null) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NavigationDrawerFragment.onViewCreated$lambda$1(NavigationDrawerFragment.this, view2);
                }
            });
        }
        DrawerMainBinding drawerMainBinding5 = this.binding;
        if (drawerMainBinding5 != null && (relativeLayout = drawerMainBinding5.notificationsButtonWrapper) != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NavigationDrawerFragment.onViewCreated$lambda$2(NavigationDrawerFragment.this, view2);
                }
            });
        }
    }

    public final void openDrawer() {
        View view = this.fragmentContainerView;
        if (view != null && (view.getParent() instanceof DrawerLayout)) {
            DrawerLayout drawerLayout = this.drawerLayout;
            if (drawerLayout != null) {
                drawerLayout.M(view);
            }
        } else if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void setConfigManager(AppConfigManager appConfigManager) {
        qc.q.i(appConfigManager, "<set-?>");
        this.configManager = appConfigManager;
    }

    public final void setContentRepository(ContentRepository contentRepository) {
        qc.q.i(contentRepository, "<set-?>");
        this.contentRepository = contentRepository;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setSelection(Integer num, Bundle bundle, boolean z10, boolean z11) {
        if (!this.isTabletUI) {
            closeDrawer();
        }
        NavigationDrawerAdapter navigationDrawerAdapter = this.adapter;
        if (navigationDrawerAdapter == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter = null;
        }
        if (navigationDrawerAdapter.getSelectedItem() != null) {
            NavigationDrawerAdapter navigationDrawerAdapter2 = this.adapter;
            if (navigationDrawerAdapter2 == null) {
                qc.q.z("adapter");
                navigationDrawerAdapter2 = null;
            }
            if (qc.q.d(navigationDrawerAdapter2.getSelectedItem(), num) && bundle == null && z11) {
                return;
            }
        }
        NavigationDrawerAdapter navigationDrawerAdapter3 = this.adapter;
        if (navigationDrawerAdapter3 == null) {
            qc.q.z("adapter");
            navigationDrawerAdapter3 = null;
        }
        navigationDrawerAdapter3.setSelectedItem(num);
        if (z10 && num != null) {
            if (bundle != null) {
                MainNavigationController.INSTANCE.navigate(num.intValue(), bundle);
            } else {
                MainNavigationController.navigate$default(MainNavigationController.INSTANCE, num.intValue(), null, 2, null);
            }
        }
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        qc.q.i(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setUp(int i10, DrawerLayout drawerLayout, NotificationsViewModel notificationsViewModel) {
        View view;
        qc.q.i(drawerLayout, "drawerLayout");
        qc.q.i(notificationsViewModel, "viewModel");
        androidx.fragment.app.q activity = getActivity();
        if (activity != null) {
            view = activity.findViewById(i10);
        } else {
            view = null;
        }
        this.fragmentContainerView = view;
        this.drawerLayout = drawerLayout;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NavigationDrawerFragment$setUp$1(notificationsViewModel, this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NavigationDrawerFragment$setUp$2(notificationsViewModel, this, null), 1, null);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new NavigationDrawerFragment$setUp$3(notificationsViewModel, this, null), 1, null);
    }

    public final void setUserRepository(UserRepository userRepository) {
        qc.q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    public final void toggleDrawer() {
        boolean z10;
        boolean z11;
        View view = this.fragmentContainerView;
        int i10 = 0;
        if (view != null && (view.getParent() instanceof DrawerLayout)) {
            DrawerLayout drawerLayout = this.drawerLayout;
            if (drawerLayout != null && drawerLayout.D(view)) {
                i10 = 1;
            }
            if (i10 != 0) {
                DrawerLayout drawerLayout2 = this.drawerLayout;
                if (drawerLayout2 != null) {
                    drawerLayout2.f(view);
                    return;
                }
                return;
            }
            DrawerLayout drawerLayout3 = this.drawerLayout;
            if (drawerLayout3 != null) {
                drawerLayout3.M(view);
            }
        } else if (view != null) {
            if (view.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!(true ^ z11)) {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem, T] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.habitrpg.android.habitica.ui.menu.HabiticaDrawerItem, T] */
    public final void updatePromo() {
        dc.w wVar;
        String str;
        Drawable drawable;
        this.activePromo = getConfigManager().activePromo();
        HabiticaDrawerItem itemWithIdentifier = getItemWithIdentifier(SIDEBAR_PROMO);
        if (itemWithIdentifier == null) {
            return;
        }
        HabiticaPromotion habiticaPromotion = this.activePromo;
        NavigationDrawerAdapter navigationDrawerAdapter = null;
        if (habiticaPromotion != null) {
            SharedPreferences sharedPreferences = getSharedPreferences();
            String identifier = habiticaPromotion.getIdentifier();
            itemWithIdentifier.setVisible(!sharedPreferences.getBoolean("hide" + identifier, false));
            NavigationDrawerAdapter navigationDrawerAdapter2 = this.adapter;
            if (navigationDrawerAdapter2 == null) {
                qc.q.z("adapter");
                navigationDrawerAdapter2 = null;
            }
            navigationDrawerAdapter2.setActivePromo(habiticaPromotion);
            f0 f0Var = new f0();
            if (habiticaPromotion.getPromoType() == PromoType.GEMS_AMOUNT || habiticaPromotion.getPromoType() == PromoType.GEMS_PRICE) {
                f0Var.f21676f = getItemWithIdentifier(SIDEBAR_GEMS);
            }
            if (habiticaPromotion.getPromoType() == PromoType.SUBSCRIPTION) {
                f0Var.f21676f = getItemWithIdentifier(SIDEBAR_SUBSCRIPTION);
            }
            T t10 = f0Var.f21676f;
            if (t10 != 0) {
                HabiticaDrawerItem habiticaDrawerItem = (HabiticaDrawerItem) t10;
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.sale);
                } else {
                    str = null;
                }
                habiticaDrawerItem.setPillText(str);
                HabiticaDrawerItem habiticaDrawerItem2 = (HabiticaDrawerItem) f0Var.f21676f;
                Context context2 = getContext();
                if (context2 != null) {
                    qc.q.f(context2);
                    drawable = habiticaPromotion.pillBackgroundDrawable(context2);
                } else {
                    drawable = null;
                }
                habiticaDrawerItem2.setPillBackground(drawable);
                createUpdatingJob(habiticaPromotion.getPromoType().name(), new NavigationDrawerFragment$updatePromo$1$2(habiticaPromotion), new NavigationDrawerFragment$updatePromo$1$3(habiticaPromotion), new NavigationDrawerFragment$updatePromo$1$4(habiticaPromotion, f0Var, this));
            }
            wVar = dc.w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            itemWithIdentifier.setVisible(false);
        }
        NavigationDrawerAdapter navigationDrawerAdapter3 = this.adapter;
        if (navigationDrawerAdapter3 == null) {
            qc.q.z("adapter");
        } else {
            navigationDrawerAdapter = navigationDrawerAdapter3;
        }
        navigationDrawerAdapter.updateItem(itemWithIdentifier);
    }
}
