package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.models.inventory.Food;
import com.habitrpg.android.habitica.models.inventory.Pet;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.adapter.inventory.PetDetailRecyclerAdapter;
import com.habitrpg.android.habitica.ui.fragments.inventory.items.ItemDialogFragment;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.shared.habitica.models.responses.FeedResponse;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: PetDetailRecyclerFragment.kt */
/* loaded from: classes4.dex */
public final class PetDetailRecyclerFragment extends Hilt_PetDetailRecyclerFragment<FragmentRefreshRecyclerviewBinding> implements SwipeRefreshLayout.j {
    private static final String ANIMAL_TYPE_KEY = "ANIMAL_TYPE_KEY";
    private final PetDetailRecyclerAdapter adapter = new PetDetailRecyclerAdapter();
    private String animalColor;
    private String animalGroup;
    private String animalType;
    private FragmentRefreshRecyclerviewBinding binding;
    public FeedPetUseCase feedPetUseCase;
    public InventoryRepository inventoryRepository;
    private GridLayoutManager layoutManager;
    public ReviewManager reviewManager;
    public MainUserViewModel userViewModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PetDetailRecyclerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void loadItems() {
        /*
            r11 = this;
            java.lang.String r0 = r11.animalType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != r2) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 != 0) goto L28
            java.lang.String r0 = r11.animalGroup
            if (r0 == 0) goto L26
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != r2) goto L26
            r1 = 1
        L26:
            if (r1 == 0) goto L5d
        L28:
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r11)
            com.habitrpg.common.habitica.helpers.ExceptionHandler$Companion r0 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion
            r1 = 0
            ad.h0 r4 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion.coroutine$default(r0, r1, r2, r1)
            r5 = 0
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$1 r6 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$1
            r6.<init>(r11, r1)
            r7 = 2
            r8 = 0
            ad.g.d(r3, r4, r5, r6, r7, r8)
            androidx.lifecycle.q r3 = androidx.lifecycle.w.a(r11)
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$2 r4 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$2
            r4.<init>(r11, r1)
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r3, r1, r4, r2, r1)
            androidx.lifecycle.q r5 = androidx.lifecycle.w.a(r11)
            ad.h0 r6 = com.habitrpg.common.habitica.helpers.ExceptionHandler.Companion.coroutine$default(r0, r1, r2, r1)
            r7 = 0
            com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3 r8 = new com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$loadItems$3
            r8.<init>(r11, r1)
            r9 = 2
            r10 = 0
            ad.g.d(r5, r6, r7, r8, r9, r10)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.loadItems():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(PetDetailRecyclerFragment petDetailRecyclerFragment, View view) {
        q.i(petDetailRecyclerFragment, "this$0");
        q.i(view, "$view");
        petDetailRecyclerFragment.setGridSpanCount(view.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setGridSpanCount(int r3) {
        /*
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L2d
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L11
            android.content.res.Resources r0 = r0.getResources()
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L2d
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L28
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L28
            r1 = 2131166035(0x7f070353, float:1.7946304E38)
            float r0 = r0.getDimension(r1)
            goto L29
        L28:
            r0 = 0
        L29:
            float r3 = (float) r3
            float r3 = r3 / r0
            int r3 = (int) r3
            goto L2e
        L2d:
            r3 = 0
        L2e:
            if (r3 != 0) goto L31
            r3 = 1
        L31:
            androidx.recyclerview.widget.GridLayoutManager r0 = r2.layoutManager
            if (r0 != 0) goto L36
            goto L39
        L36:
            r0.l3(r3)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment.setGridSpanCount(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showFeedingDialog(Pet pet, Food food, Continuation<? super FeedResponse> continuation) {
        Continuation c10;
        Object d10;
        if (food == null) {
            c10 = ic.c.c(continuation);
            hc.h hVar = new hc.h(c10);
            ItemDialogFragment itemDialogFragment = new ItemDialogFragment();
            itemDialogFragment.setFeedingPet(pet);
            itemDialogFragment.setFeeding(true);
            itemDialogFragment.setHatching(false);
            itemDialogFragment.setItemType("food");
            itemDialogFragment.setItemTypeText(getString(R.string.food));
            itemDialogFragment.setOnFeedResult(new PetDetailRecyclerFragment$showFeedingDialog$2$1(hVar));
            itemDialogFragment.show(getParentFragmentManager(), "feedDialog");
            Object a10 = hVar.a();
            d10 = ic.d.d();
            if (a10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return a10;
        }
        Context mainActivity = getMainActivity();
        if (mainActivity == null && (mainActivity = getContext()) == null) {
            return null;
        }
        return getFeedPetUseCase().callInteractor(new FeedPetUseCase.RequestValues(pet, food, mainActivity), continuation);
    }

    public final PetDetailRecyclerAdapter getAdapter() {
        return this.adapter;
    }

    public final FeedPetUseCase getFeedPetUseCase() {
        FeedPetUseCase feedPetUseCase = this.feedPetUseCase;
        if (feedPetUseCase != null) {
            return feedPetUseCase;
        }
        q.z("feedPetUseCase");
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

    public final GridLayoutManager getLayoutManager$Habitica_2311256681_prodRelease() {
        return this.layoutManager;
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        q.z("reviewManager");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        setUsesTabLayout(false);
        if (bundle != null) {
            this.animalType = bundle.getString(ANIMAL_TYPE_KEY, "");
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
    public void onRefresh() {
        ad.i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new PetDetailRecyclerFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setTitle(this.animalType);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        q.i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString(ANIMAL_TYPE_KEY, this.animalType);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        RecyclerViewEmptySupport recyclerViewEmptySupport3;
        SwipeRefreshLayout swipeRefreshLayout;
        q.i(view, "view");
        setShowsBackButton(true);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            PetDetailRecyclerFragmentArgs fromBundle = PetDetailRecyclerFragmentArgs.fromBundle(arguments);
            q.h(fromBundle, "fromBundle(...)");
            if (!q.d(fromBundle.getGroup(), "drop")) {
                this.animalGroup = fromBundle.getGroup();
            }
            this.animalType = fromBundle.getType();
            this.animalColor = fromBundle.getColor();
        }
        FragmentRefreshRecyclerviewBinding binding = getBinding();
        if (binding != null && (swipeRefreshLayout = binding.refreshLayout) != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 4);
        this.layoutManager = gridLayoutManager;
        gridLayoutManager.m3(new GridLayoutManager.c() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.PetDetailRecyclerFragment$onViewCreated$2
            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int i10) {
                GridLayoutManager layoutManager$Habitica_2311256681_prodRelease;
                if ((PetDetailRecyclerFragment.this.getAdapter().getItemViewType(i10) != 0 && PetDetailRecyclerFragment.this.getAdapter().getItemViewType(i10) != 1) || (layoutManager$Habitica_2311256681_prodRelease = PetDetailRecyclerFragment.this.getLayoutManager$Habitica_2311256681_prodRelease()) == null) {
                    return 1;
                }
                return layoutManager$Habitica_2311256681_prodRelease.e3();
            }
        });
        FragmentRefreshRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(this.layoutManager);
        }
        this.adapter.setAnimalIngredientsRetriever(new PetDetailRecyclerFragment$onViewCreated$3(this));
        FragmentRefreshRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport2 = binding3.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setAdapter(this.adapter);
        }
        FragmentRefreshRecyclerviewBinding binding4 = getBinding();
        if (binding4 != null) {
            recyclerViewEmptySupport3 = binding4.recyclerView;
        } else {
            recyclerViewEmptySupport3 = null;
        }
        if (recyclerViewEmptySupport3 != null) {
            recyclerViewEmptySupport3.setItemAnimator(new SafeDefaultItemAnimator());
        }
        loadItems();
        this.adapter.setOnEquip(new PetDetailRecyclerFragment$onViewCreated$4(this));
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new PetDetailRecyclerFragment$sam$androidx_lifecycle_Observer$0(new PetDetailRecyclerFragment$onViewCreated$5(this)));
        this.adapter.setOnFeed(new PetDetailRecyclerFragment$onViewCreated$6(this, null));
        view.post(new Runnable() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.stable.c
            @Override // java.lang.Runnable
            public final void run() {
                PetDetailRecyclerFragment.onViewCreated$lambda$1(PetDetailRecyclerFragment.this, view);
            }
        });
    }

    public final void setFeedPetUseCase(FeedPetUseCase feedPetUseCase) {
        q.i(feedPetUseCase, "<set-?>");
        this.feedPetUseCase = feedPetUseCase;
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setLayoutManager$Habitica_2311256681_prodRelease(GridLayoutManager gridLayoutManager) {
        this.layoutManager = gridLayoutManager;
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentRefreshRecyclerviewBinding inflate = FragmentRefreshRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRefreshRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRefreshRecyclerviewBinding fragmentRefreshRecyclerviewBinding) {
        this.binding = fragmentRefreshRecyclerviewBinding;
    }
}
