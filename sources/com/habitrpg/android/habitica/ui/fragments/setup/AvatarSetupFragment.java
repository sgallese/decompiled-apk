package com.habitrpg.android.habitica.ui.fragments.setup;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.databinding.AvatarSetupDrawerBinding;
import com.habitrpg.android.habitica.databinding.FragmentSetupAvatarBinding;
import com.habitrpg.android.habitica.models.SetupCustomization;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.SpeechBubbleView;
import com.habitrpg.android.habitica.ui.activities.SetupActivity;
import com.habitrpg.android.habitica.ui.adapter.setup.CustomizationSetupAdapter;
import com.habitrpg.android.habitica.ui.views.setup.AvatarCategoryView;
import com.habitrpg.android.habitica.ui.views.setup.AvatarCustomizationDrawer;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.views.AvatarView;
import ec.s;
import ec.t;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import qc.q;

/* compiled from: AvatarSetupFragment.kt */
/* loaded from: classes4.dex */
public final class AvatarSetupFragment extends Hilt_AvatarSetupFragment<FragmentSetupAvatarBinding> {
    public static final int $stable = 8;
    private AvatarCategoryView activeButton;
    private String activeCategory;
    private String activeSubCategory;
    private SetupActivity activity;
    private CustomizationSetupAdapter adapter;
    private FragmentSetupAvatarBinding binding;
    public SetupCustomizationRepository customizationRepository;
    public InventoryRepository inventoryRepository;
    private Random random;
    private List<String> subcategories;
    private User user;
    public UserRepository userRepository;
    private int width;

    public AvatarSetupFragment() {
        List<String> i10;
        i10 = t.i();
        this.subcategories = i10;
        this.random = new Random();
    }

    private final void activateButton(AvatarCategoryView avatarCategoryView) {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding2;
        ImageView imageView;
        AvatarCategoryView avatarCategoryView2 = this.activeButton;
        if (avatarCategoryView2 != null && avatarCategoryView2 != null) {
            avatarCategoryView2.setActive(false);
        }
        this.activeButton = avatarCategoryView;
        if (avatarCategoryView != null) {
            avatarCategoryView.setActive(true);
        }
        int[] iArr = new int[2];
        FragmentSetupAvatarBinding binding3 = getBinding();
        ImageView imageView2 = null;
        if (binding3 != null && (avatarCustomizationDrawer2 = binding3.customizationDrawer) != null && (binding2 = avatarCustomizationDrawer2.getBinding()) != null && (imageView = binding2.caretView) != null) {
            layoutParams = imageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        AvatarCategoryView avatarCategoryView3 = this.activeButton;
        if (avatarCategoryView3 != null) {
            avatarCategoryView3.getLocationOnScreen(iArr);
        }
        Resources resources = getResources();
        q.h(resources, "getResources(...)");
        int applyDimension = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(iArr[0] + applyDimension);
        }
        FragmentSetupAvatarBinding binding4 = getBinding();
        if (binding4 != null && (avatarCustomizationDrawer = binding4.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null) {
            imageView2 = binding.caretView;
        }
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams2);
        }
    }

    private final String chooseRandomKey(List<SetupCustomization> list, boolean z10) {
        if (list.isEmpty()) {
            return "";
        }
        if (z10 && this.random.nextInt(10) > 3) {
            return list.get(0).getKey();
        }
        return list.get(this.random.nextInt(list.size())).getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCustomizations() {
        String str;
        CustomizationSetupAdapter customizationSetupAdapter;
        User user = this.user;
        if (user != null && (str = this.activeCategory) != null && (customizationSetupAdapter = this.adapter) != null) {
            customizationSetupAdapter.setCustomizationList(getCustomizationRepository().getCustomizations(str, this.activeSubCategory, user));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(AvatarSetupFragment avatarSetupFragment, View view) {
        q.i(avatarSetupFragment, "this$0");
        avatarSetupFragment.selectedBodyCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(AvatarSetupFragment avatarSetupFragment, View view) {
        q.i(avatarSetupFragment, "this$0");
        avatarSetupFragment.selectedSkinCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(AvatarSetupFragment avatarSetupFragment, View view) {
        q.i(avatarSetupFragment, "this$0");
        avatarSetupFragment.selectedHairCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(AvatarSetupFragment avatarSetupFragment, View view) {
        q.i(avatarSetupFragment, "this$0");
        avatarSetupFragment.selectedExtrasCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(AvatarSetupFragment avatarSetupFragment, View view) {
        q.i(avatarSetupFragment, "this$0");
        avatarSetupFragment.randomizeCharacter();
    }

    private final void randomizeCharacter() {
        User user = this.user;
        if (user == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("preferences.size", chooseRandomKey(getCustomizationRepository().getCustomizations("body", "size", user), false));
        hashMap.put("preferences.shirt", chooseRandomKey(getCustomizationRepository().getCustomizations("body", "shirt", user), false));
        hashMap.put("preferences.skin", chooseRandomKey(getCustomizationRepository().getCustomizations("skin", "color", user), false));
        hashMap.put("preferences.hair.color", chooseRandomKey(getCustomizationRepository().getCustomizations("hair", "color", user), false));
        hashMap.put("preferences.hair.base", chooseRandomKey(getCustomizationRepository().getCustomizations("hair", "ponytail", user), false));
        hashMap.put("preferences.hair.bangs", chooseRandomKey(getCustomizationRepository().getCustomizations("hair", "bangs", user), false));
        hashMap.put("preferences.hair.flower", chooseRandomKey(getCustomizationRepository().getCustomizations("extras", "flower", user), true));
        hashMap.put("preferences.chair", chooseRandomKey(getCustomizationRepository().getCustomizations("extras", "wheelchair", user), true));
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new AvatarSetupFragment$randomizeCharacter$1(this, hashMap, null), 1, null);
    }

    private final void selectedBodyCategory() {
        AvatarCategoryView avatarCategoryView;
        List<String> l10;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        TabLayout tabLayout;
        TabLayout.g E;
        TabLayout.g r10;
        FragmentSetupAvatarBinding binding2;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding3;
        TabLayout tabLayout2;
        AvatarCustomizationDrawer avatarCustomizationDrawer3;
        AvatarSetupDrawerBinding binding4;
        TabLayout tabLayout3;
        TabLayout.g E2;
        TabLayout.g r11;
        FragmentSetupAvatarBinding binding5;
        AvatarCustomizationDrawer avatarCustomizationDrawer4;
        AvatarSetupDrawerBinding binding6;
        TabLayout tabLayout4;
        AvatarCustomizationDrawer avatarCustomizationDrawer5;
        AvatarSetupDrawerBinding binding7;
        TabLayout tabLayout5;
        AvatarCustomizationDrawer avatarCustomizationDrawer6;
        AvatarSetupDrawerBinding binding8;
        FragmentSetupAvatarBinding binding9 = getBinding();
        if (binding9 != null && (avatarCustomizationDrawer6 = binding9.customizationDrawer) != null && (binding8 = avatarCustomizationDrawer6.getBinding()) != null) {
            avatarCategoryView = binding8.bodyButton;
        } else {
            avatarCategoryView = null;
        }
        activateButton(avatarCategoryView);
        this.activeCategory = "body";
        FragmentSetupAvatarBinding binding10 = getBinding();
        if (binding10 != null && (avatarCustomizationDrawer5 = binding10.customizationDrawer) != null && (binding7 = avatarCustomizationDrawer5.getBinding()) != null && (tabLayout5 = binding7.subcategoryTabs) != null) {
            tabLayout5.H();
        }
        l10 = t.l("size", "shirt");
        this.subcategories = l10;
        FragmentSetupAvatarBinding binding11 = getBinding();
        if (binding11 != null && (avatarCustomizationDrawer3 = binding11.customizationDrawer) != null && (binding4 = avatarCustomizationDrawer3.getBinding()) != null && (tabLayout3 = binding4.subcategoryTabs) != null && (E2 = tabLayout3.E()) != null && (r11 = E2.r(R.string.avatar_size)) != null && (binding5 = getBinding()) != null && (avatarCustomizationDrawer4 = binding5.customizationDrawer) != null && (binding6 = avatarCustomizationDrawer4.getBinding()) != null && (tabLayout4 = binding6.subcategoryTabs) != null) {
            tabLayout4.i(r11);
        }
        FragmentSetupAvatarBinding binding12 = getBinding();
        if (binding12 != null && (avatarCustomizationDrawer = binding12.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null && (tabLayout = binding.subcategoryTabs) != null && (E = tabLayout.E()) != null && (r10 = E.r(R.string.avatar_shirt)) != null && (binding2 = getBinding()) != null && (avatarCustomizationDrawer2 = binding2.customizationDrawer) != null && (binding3 = avatarCustomizationDrawer2.getBinding()) != null && (tabLayout2 = binding3.subcategoryTabs) != null) {
            tabLayout2.i(r10);
        }
        loadCustomizations();
    }

    private final void selectedExtrasCategory() {
        AvatarCategoryView avatarCategoryView;
        List<String> l10;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        TabLayout tabLayout;
        TabLayout.g E;
        TabLayout.g r10;
        FragmentSetupAvatarBinding binding2;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding3;
        TabLayout tabLayout2;
        AvatarCustomizationDrawer avatarCustomizationDrawer3;
        AvatarSetupDrawerBinding binding4;
        TabLayout tabLayout3;
        TabLayout.g E2;
        TabLayout.g r11;
        FragmentSetupAvatarBinding binding5;
        AvatarCustomizationDrawer avatarCustomizationDrawer4;
        AvatarSetupDrawerBinding binding6;
        TabLayout tabLayout4;
        AvatarCustomizationDrawer avatarCustomizationDrawer5;
        AvatarSetupDrawerBinding binding7;
        TabLayout tabLayout5;
        TabLayout.g E3;
        TabLayout.g r12;
        FragmentSetupAvatarBinding binding8;
        AvatarCustomizationDrawer avatarCustomizationDrawer6;
        AvatarSetupDrawerBinding binding9;
        TabLayout tabLayout6;
        AvatarCustomizationDrawer avatarCustomizationDrawer7;
        AvatarSetupDrawerBinding binding10;
        TabLayout tabLayout7;
        AvatarCustomizationDrawer avatarCustomizationDrawer8;
        AvatarSetupDrawerBinding binding11;
        FragmentSetupAvatarBinding binding12 = getBinding();
        if (binding12 != null && (avatarCustomizationDrawer8 = binding12.customizationDrawer) != null && (binding11 = avatarCustomizationDrawer8.getBinding()) != null) {
            avatarCategoryView = binding11.extrasButton;
        } else {
            avatarCategoryView = null;
        }
        activateButton(avatarCategoryView);
        this.activeCategory = "extras";
        FragmentSetupAvatarBinding binding13 = getBinding();
        if (binding13 != null && (avatarCustomizationDrawer7 = binding13.customizationDrawer) != null && (binding10 = avatarCustomizationDrawer7.getBinding()) != null && (tabLayout7 = binding10.subcategoryTabs) != null) {
            tabLayout7.H();
        }
        l10 = t.l("glasses", "flower", "wheelchair");
        this.subcategories = l10;
        FragmentSetupAvatarBinding binding14 = getBinding();
        if (binding14 != null && (avatarCustomizationDrawer5 = binding14.customizationDrawer) != null && (binding7 = avatarCustomizationDrawer5.getBinding()) != null && (tabLayout5 = binding7.subcategoryTabs) != null && (E3 = tabLayout5.E()) != null && (r12 = E3.r(R.string.avatar_glasses)) != null && (binding8 = getBinding()) != null && (avatarCustomizationDrawer6 = binding8.customizationDrawer) != null && (binding9 = avatarCustomizationDrawer6.getBinding()) != null && (tabLayout6 = binding9.subcategoryTabs) != null) {
            tabLayout6.i(r12);
        }
        FragmentSetupAvatarBinding binding15 = getBinding();
        if (binding15 != null && (avatarCustomizationDrawer3 = binding15.customizationDrawer) != null && (binding4 = avatarCustomizationDrawer3.getBinding()) != null && (tabLayout3 = binding4.subcategoryTabs) != null && (E2 = tabLayout3.E()) != null && (r11 = E2.r(R.string.avatar_flower)) != null && (binding5 = getBinding()) != null && (avatarCustomizationDrawer4 = binding5.customizationDrawer) != null && (binding6 = avatarCustomizationDrawer4.getBinding()) != null && (tabLayout4 = binding6.subcategoryTabs) != null) {
            tabLayout4.i(r11);
        }
        FragmentSetupAvatarBinding binding16 = getBinding();
        if (binding16 != null && (avatarCustomizationDrawer = binding16.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null && (tabLayout = binding.subcategoryTabs) != null && (E = tabLayout.E()) != null && (r10 = E.r(R.string.avatar_wheelchair)) != null && (binding2 = getBinding()) != null && (avatarCustomizationDrawer2 = binding2.customizationDrawer) != null && (binding3 = avatarCustomizationDrawer2.getBinding()) != null && (tabLayout2 = binding3.subcategoryTabs) != null) {
            tabLayout2.i(r10);
        }
        loadCustomizations();
    }

    private final void selectedHairCategory() {
        AvatarCategoryView avatarCategoryView;
        List<String> l10;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        TabLayout tabLayout;
        TabLayout.g E;
        TabLayout.g r10;
        FragmentSetupAvatarBinding binding2;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding3;
        TabLayout tabLayout2;
        AvatarCustomizationDrawer avatarCustomizationDrawer3;
        AvatarSetupDrawerBinding binding4;
        TabLayout tabLayout3;
        TabLayout.g E2;
        TabLayout.g r11;
        FragmentSetupAvatarBinding binding5;
        AvatarCustomizationDrawer avatarCustomizationDrawer4;
        AvatarSetupDrawerBinding binding6;
        TabLayout tabLayout4;
        AvatarCustomizationDrawer avatarCustomizationDrawer5;
        AvatarSetupDrawerBinding binding7;
        TabLayout tabLayout5;
        TabLayout.g E3;
        TabLayout.g r12;
        FragmentSetupAvatarBinding binding8;
        AvatarCustomizationDrawer avatarCustomizationDrawer6;
        AvatarSetupDrawerBinding binding9;
        TabLayout tabLayout6;
        AvatarCustomizationDrawer avatarCustomizationDrawer7;
        AvatarSetupDrawerBinding binding10;
        TabLayout tabLayout7;
        AvatarCustomizationDrawer avatarCustomizationDrawer8;
        AvatarSetupDrawerBinding binding11;
        FragmentSetupAvatarBinding binding12 = getBinding();
        if (binding12 != null && (avatarCustomizationDrawer8 = binding12.customizationDrawer) != null && (binding11 = avatarCustomizationDrawer8.getBinding()) != null) {
            avatarCategoryView = binding11.hairButton;
        } else {
            avatarCategoryView = null;
        }
        activateButton(avatarCategoryView);
        this.activeCategory = "hair";
        FragmentSetupAvatarBinding binding13 = getBinding();
        if (binding13 != null && (avatarCustomizationDrawer7 = binding13.customizationDrawer) != null && (binding10 = avatarCustomizationDrawer7.getBinding()) != null && (tabLayout7 = binding10.subcategoryTabs) != null) {
            tabLayout7.H();
        }
        l10 = t.l("bangs", "color", "ponytail");
        this.subcategories = l10;
        FragmentSetupAvatarBinding binding14 = getBinding();
        if (binding14 != null && (avatarCustomizationDrawer5 = binding14.customizationDrawer) != null && (binding7 = avatarCustomizationDrawer5.getBinding()) != null && (tabLayout5 = binding7.subcategoryTabs) != null && (E3 = tabLayout5.E()) != null && (r12 = E3.r(R.string.avatar_hair_bangs)) != null && (binding8 = getBinding()) != null && (avatarCustomizationDrawer6 = binding8.customizationDrawer) != null && (binding9 = avatarCustomizationDrawer6.getBinding()) != null && (tabLayout6 = binding9.subcategoryTabs) != null) {
            tabLayout6.i(r12);
        }
        FragmentSetupAvatarBinding binding15 = getBinding();
        if (binding15 != null && (avatarCustomizationDrawer3 = binding15.customizationDrawer) != null && (binding4 = avatarCustomizationDrawer3.getBinding()) != null && (tabLayout3 = binding4.subcategoryTabs) != null && (E2 = tabLayout3.E()) != null && (r11 = E2.r(R.string.avatar_hair_color)) != null && (binding5 = getBinding()) != null && (avatarCustomizationDrawer4 = binding5.customizationDrawer) != null && (binding6 = avatarCustomizationDrawer4.getBinding()) != null && (tabLayout4 = binding6.subcategoryTabs) != null) {
            tabLayout4.i(r11);
        }
        FragmentSetupAvatarBinding binding16 = getBinding();
        if (binding16 != null && (avatarCustomizationDrawer = binding16.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null && (tabLayout = binding.subcategoryTabs) != null && (E = tabLayout.E()) != null && (r10 = E.r(R.string.avatar_hair_ponytail)) != null && (binding2 = getBinding()) != null && (avatarCustomizationDrawer2 = binding2.customizationDrawer) != null && (binding3 = avatarCustomizationDrawer2.getBinding()) != null && (tabLayout2 = binding3.subcategoryTabs) != null) {
            tabLayout2.i(r10);
        }
        loadCustomizations();
    }

    private final void selectedSkinCategory() {
        AvatarCategoryView avatarCategoryView;
        List<String> d10;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        TabLayout tabLayout;
        TabLayout.g E;
        TabLayout.g r10;
        FragmentSetupAvatarBinding binding2;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding3;
        TabLayout tabLayout2;
        AvatarCustomizationDrawer avatarCustomizationDrawer3;
        AvatarSetupDrawerBinding binding4;
        TabLayout tabLayout3;
        AvatarCustomizationDrawer avatarCustomizationDrawer4;
        AvatarSetupDrawerBinding binding5;
        FragmentSetupAvatarBinding binding6 = getBinding();
        if (binding6 != null && (avatarCustomizationDrawer4 = binding6.customizationDrawer) != null && (binding5 = avatarCustomizationDrawer4.getBinding()) != null) {
            avatarCategoryView = binding5.skinButton;
        } else {
            avatarCategoryView = null;
        }
        activateButton(avatarCategoryView);
        this.activeCategory = "skin";
        FragmentSetupAvatarBinding binding7 = getBinding();
        if (binding7 != null && (avatarCustomizationDrawer3 = binding7.customizationDrawer) != null && (binding4 = avatarCustomizationDrawer3.getBinding()) != null && (tabLayout3 = binding4.subcategoryTabs) != null) {
            tabLayout3.H();
        }
        d10 = s.d("color");
        this.subcategories = d10;
        FragmentSetupAvatarBinding binding8 = getBinding();
        if (binding8 != null && (avatarCustomizationDrawer = binding8.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null && (tabLayout = binding.subcategoryTabs) != null && (E = tabLayout.E()) != null && (r10 = E.r(R.string.avatar_skin_color)) != null && (binding2 = getBinding()) != null && (avatarCustomizationDrawer2 = binding2.customizationDrawer) != null && (binding3 = avatarCustomizationDrawer2.getBinding()) != null && (tabLayout2 = binding3.subcategoryTabs) != null) {
            tabLayout2.i(r10);
        }
        loadCustomizations();
    }

    private final void updateAvatar() {
        FragmentSetupAvatarBinding binding;
        AvatarView avatarView;
        User user = this.user;
        if (user != null && (binding = getBinding()) != null && (avatarView = binding.avatarView) != null) {
            q.f(avatarView);
            AvatarView.setAvatar$default(avatarView, user, null, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final SetupActivity getActivity() {
        return this.activity;
    }

    public final CustomizationSetupAdapter getAdapter$Habitica_2311256681_prodRelease() {
        return this.adapter;
    }

    public final SetupCustomizationRepository getCustomizationRepository() {
        SetupCustomizationRepository setupCustomizationRepository = this.customizationRepository;
        if (setupCustomizationRepository != null) {
            return setupCustomizationRepository;
        }
        q.z("customizationRepository");
        return null;
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        q.z("inventoryRepository");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        FragmentSetupAvatarBinding binding;
        SpeechBubbleView speechBubbleView;
        String str;
        super.onResume();
        if (this.user != null) {
            updateAvatar();
        }
        selectedBodyCategory();
        if (getContext() != null && (binding = getBinding()) != null && (speechBubbleView = binding.speechBubble) != null) {
            Context context = getContext();
            if (context == null || (str = context.getString(R.string.avatar_setup_description)) == null) {
                str = "";
            }
            speechBubbleView.animateText(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        RecyclerView recyclerView;
        AppCompatButton appCompatButton;
        AvatarCustomizationDrawer avatarCustomizationDrawer;
        AvatarSetupDrawerBinding binding;
        AvatarCategoryView avatarCategoryView;
        AvatarCustomizationDrawer avatarCustomizationDrawer2;
        AvatarSetupDrawerBinding binding2;
        AvatarCategoryView avatarCategoryView2;
        AvatarCustomizationDrawer avatarCustomizationDrawer3;
        AvatarSetupDrawerBinding binding3;
        AvatarCategoryView avatarCategoryView3;
        AvatarCustomizationDrawer avatarCustomizationDrawer4;
        AvatarSetupDrawerBinding binding4;
        AvatarCategoryView avatarCategoryView4;
        AvatarCustomizationDrawer avatarCustomizationDrawer5;
        AvatarSetupDrawerBinding binding5;
        TabLayout tabLayout;
        AvatarCustomizationDrawer avatarCustomizationDrawer6;
        AvatarSetupDrawerBinding binding6;
        AvatarCustomizationDrawer avatarCustomizationDrawer7;
        AvatarSetupDrawerBinding binding7;
        Preferences preferences;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        CustomizationSetupAdapter customizationSetupAdapter = new CustomizationSetupAdapter();
        this.adapter = customizationSetupAdapter;
        User user = this.user;
        if (user == null || (preferences = user.getPreferences()) == null || (str = preferences.getSize()) == null) {
            str = "slim";
        }
        customizationSetupAdapter.setUserSize(str);
        CustomizationSetupAdapter customizationSetupAdapter2 = this.adapter;
        if (customizationSetupAdapter2 != null) {
            customizationSetupAdapter2.setOnUpdateUser(new AvatarSetupFragment$onViewCreated$1(this));
        }
        CustomizationSetupAdapter customizationSetupAdapter3 = this.adapter;
        if (customizationSetupAdapter3 != null) {
            customizationSetupAdapter3.setOnEquipGear(new AvatarSetupFragment$onViewCreated$2(this));
        }
        CustomizationSetupAdapter customizationSetupAdapter4 = this.adapter;
        if (customizationSetupAdapter4 != null) {
            customizationSetupAdapter4.setUser(this.user);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.activity);
        linearLayoutManager.J2(0);
        FragmentSetupAvatarBinding binding8 = getBinding();
        RecyclerView recyclerView2 = null;
        if (binding8 != null && (avatarCustomizationDrawer7 = binding8.customizationDrawer) != null && (binding7 = avatarCustomizationDrawer7.getBinding()) != null) {
            recyclerView = binding7.customizationList;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        FragmentSetupAvatarBinding binding9 = getBinding();
        if (binding9 != null && (avatarCustomizationDrawer6 = binding9.customizationDrawer) != null && (binding6 = avatarCustomizationDrawer6.getBinding()) != null) {
            recyclerView2 = binding6.customizationList;
        }
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.adapter);
        }
        FragmentSetupAvatarBinding binding10 = getBinding();
        if (binding10 != null && (avatarCustomizationDrawer5 = binding10.customizationDrawer) != null && (binding5 = avatarCustomizationDrawer5.getBinding()) != null && (tabLayout = binding5.subcategoryTabs) != null) {
            tabLayout.h(new TabLayout.d() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment$onViewCreated$3
                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabReselected(TabLayout.g gVar) {
                    q.i(gVar, "tab");
                }

                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabSelected(TabLayout.g gVar) {
                    List list;
                    List list2;
                    q.i(gVar, "tab");
                    int g10 = gVar.g();
                    list = AvatarSetupFragment.this.subcategories;
                    if (g10 < list.size()) {
                        AvatarSetupFragment avatarSetupFragment = AvatarSetupFragment.this;
                        list2 = avatarSetupFragment.subcategories;
                        avatarSetupFragment.activeSubCategory = (String) list2.get(g10);
                    }
                    AvatarSetupFragment.this.loadCustomizations();
                }

                @Override // com.google.android.material.tabs.TabLayout.c
                public void onTabUnselected(TabLayout.g gVar) {
                    q.i(gVar, "tab");
                }
            });
        }
        FragmentSetupAvatarBinding binding11 = getBinding();
        if (binding11 != null && (avatarCustomizationDrawer4 = binding11.customizationDrawer) != null && (binding4 = avatarCustomizationDrawer4.getBinding()) != null && (avatarCategoryView4 = binding4.bodyButton) != null) {
            avatarCategoryView4.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AvatarSetupFragment.onViewCreated$lambda$0(AvatarSetupFragment.this, view2);
                }
            });
        }
        FragmentSetupAvatarBinding binding12 = getBinding();
        if (binding12 != null && (avatarCustomizationDrawer3 = binding12.customizationDrawer) != null && (binding3 = avatarCustomizationDrawer3.getBinding()) != null && (avatarCategoryView3 = binding3.skinButton) != null) {
            avatarCategoryView3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AvatarSetupFragment.onViewCreated$lambda$1(AvatarSetupFragment.this, view2);
                }
            });
        }
        FragmentSetupAvatarBinding binding13 = getBinding();
        if (binding13 != null && (avatarCustomizationDrawer2 = binding13.customizationDrawer) != null && (binding2 = avatarCustomizationDrawer2.getBinding()) != null && (avatarCategoryView2 = binding2.hairButton) != null) {
            avatarCategoryView2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AvatarSetupFragment.onViewCreated$lambda$2(AvatarSetupFragment.this, view2);
                }
            });
        }
        FragmentSetupAvatarBinding binding14 = getBinding();
        if (binding14 != null && (avatarCustomizationDrawer = binding14.customizationDrawer) != null && (binding = avatarCustomizationDrawer.getBinding()) != null && (avatarCategoryView = binding.extrasButton) != null) {
            avatarCategoryView.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AvatarSetupFragment.onViewCreated$lambda$3(AvatarSetupFragment.this, view2);
                }
            });
        }
        FragmentSetupAvatarBinding binding15 = getBinding();
        if (binding15 != null && (appCompatButton = binding15.randomizeButton) != null) {
            appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AvatarSetupFragment.onViewCreated$lambda$4(AvatarSetupFragment.this, view2);
                }
            });
        }
        selectedBodyCategory();
        if (this.user != null) {
            updateAvatar();
        }
    }

    public final void setActivity(SetupActivity setupActivity) {
        this.activity = setupActivity;
    }

    public final void setAdapter$Habitica_2311256681_prodRelease(CustomizationSetupAdapter customizationSetupAdapter) {
        this.adapter = customizationSetupAdapter;
    }

    public final void setCustomizationRepository(SetupCustomizationRepository setupCustomizationRepository) {
        q.i(setupCustomizationRepository, "<set-?>");
        this.customizationRepository = setupCustomizationRepository;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setUser(User user) {
        AvatarView avatarView;
        this.user = user;
        FragmentSetupAvatarBinding binding = getBinding();
        if (binding != null) {
            avatarView = binding.avatarView;
        } else {
            avatarView = null;
        }
        if (avatarView != null) {
            updateAvatar();
        }
        CustomizationSetupAdapter customizationSetupAdapter = this.adapter;
        if (customizationSetupAdapter != null) {
            if (customizationSetupAdapter != null) {
                customizationSetupAdapter.setUser(user);
            }
            CustomizationSetupAdapter customizationSetupAdapter2 = this.adapter;
            if (customizationSetupAdapter2 != null) {
                customizationSetupAdapter2.notifyDataSetChanged();
            }
            loadCustomizations();
        }
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSetupAvatarBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentSetupAvatarBinding inflate = FragmentSetupAvatarBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentSetupAvatarBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentSetupAvatarBinding fragmentSetupAvatarBinding) {
        this.binding = fragmentSetupAvatarBinding;
    }
}
