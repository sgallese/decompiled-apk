package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentViewpagerBinding;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import qc.q;

/* compiled from: ItemsFragment.kt */
/* loaded from: classes4.dex */
public final class ItemsFragment extends Hilt_ItemsFragment<FragmentViewpagerBinding> {
    public static final int $stable = 8;
    private FragmentViewpagerBinding binding;

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPageTitle(int i10) {
        String str = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            str = "";
                        } else {
                            MainActivity mainActivity = getMainActivity();
                            if (mainActivity != null) {
                                str = mainActivity.getString(R.string.special);
                            }
                        }
                    } else {
                        MainActivity mainActivity2 = getMainActivity();
                        if (mainActivity2 != null) {
                            str = mainActivity2.getString(R.string.quests);
                        }
                    }
                } else {
                    MainActivity mainActivity3 = getMainActivity();
                    if (mainActivity3 != null) {
                        str = mainActivity3.getString(R.string.food);
                    }
                }
            } else {
                MainActivity mainActivity4 = getMainActivity();
                if (mainActivity4 != null) {
                    str = mainActivity4.getString(R.string.hatching_potions);
                }
            }
        } else {
            MainActivity mainActivity5 = getMainActivity();
            if (mainActivity5 != null) {
                str = mainActivity5.getString(R.string.eggs);
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    private final void setViewPagerAdapter() {
        ViewPager2 viewPager2;
        FragmentViewpagerBinding binding;
        ViewPager2 viewPager22;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        q.h(childFragmentManager, "getChildFragmentManager(...)");
        FragmentViewpagerBinding binding2 = getBinding();
        if (binding2 != null) {
            viewPager2 = binding2.viewPager;
        } else {
            viewPager2 = null;
        }
        if (viewPager2 != null) {
            final p lifecycle = getLifecycle();
            viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemsFragment$setViewPagerAdapter$1
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter
                public Fragment createFragment(int i10) {
                    String str;
                    String pageTitle;
                    ItemRecyclerFragment itemRecyclerFragment = new ItemRecyclerFragment();
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        str = "";
                                    } else {
                                        str = "special";
                                    }
                                } else {
                                    str = "quests";
                                }
                            } else {
                                str = "food";
                            }
                        } else {
                            str = "hatchingPotions";
                        }
                    } else {
                        str = "eggs";
                    }
                    itemRecyclerFragment.setItemType(str);
                    if (i10 != 4 || !this.isAdded()) {
                        pageTitle = this.getPageTitle(i10);
                    } else {
                        pageTitle = this.getString(R.string.special_items);
                    }
                    itemRecyclerFragment.setItemTypeText(pageTitle);
                    return itemRecyclerFragment;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.h
                public int getItemCount() {
                    return 5;
                }
            });
        }
        TabLayout tabLayout = getTabLayout();
        if (tabLayout != null && (binding = getBinding()) != null && (viewPager22 = binding.viewPager) != null) {
            new com.google.android.material.tabs.e(tabLayout, viewPager22, new e.b() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.items.d
                @Override // com.google.android.material.tabs.e.b
                public final void a(TabLayout.g gVar, int i10) {
                    ItemsFragment.setViewPagerAdapter$lambda$3$lambda$2$lambda$1(ItemsFragment.this, gVar, i10);
                }
            }).a();
        }
        TabLayout tabLayout2 = getTabLayout();
        if (tabLayout2 != null) {
            tabLayout2.setTabMode(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setViewPagerAdapter$lambda$3$lambda$2$lambda$1(ItemsFragment itemsFragment, TabLayout.g gVar, int i10) {
        q.i(itemsFragment, "this$0");
        q.i(gVar, "tab");
        gVar.s(itemsFragment.getPageTitle(i10));
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(true);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentViewpagerBinding binding = getBinding();
        ViewPager2 viewPager22 = null;
        if (binding != null) {
            viewPager2 = binding.viewPager;
        } else {
            viewPager2 = null;
        }
        int i10 = 0;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        setViewPagerAdapter();
        Bundle arguments = getArguments();
        if (arguments != null) {
            ItemsFragmentArgs fromBundle = ItemsFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            FragmentViewpagerBinding binding2 = getBinding();
            if (binding2 != null) {
                viewPager22 = binding2.viewPager;
            }
            if (viewPager22 != null) {
                String itemType = fromBundle.getItemType();
                if (itemType != null) {
                    switch (itemType.hashCode()) {
                        case -2008465223:
                            if (itemType.equals("special")) {
                                i10 = 4;
                                break;
                            }
                            break;
                        case -1623737538:
                            if (itemType.equals("hatchingPotions")) {
                                i10 = 1;
                                break;
                            }
                            break;
                        case -948698159:
                            if (itemType.equals("quests")) {
                                i10 = 3;
                                break;
                            }
                            break;
                        case 3148894:
                            if (itemType.equals("food")) {
                                i10 = 2;
                                break;
                            }
                            break;
                    }
                }
                viewPager22.setCurrentItem(i10);
            }
        }
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentViewpagerBinding inflate = FragmentViewpagerBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentViewpagerBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentViewpagerBinding fragmentViewpagerBinding) {
        this.binding = fragmentViewpagerBinding;
    }
}
