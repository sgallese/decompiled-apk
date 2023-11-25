package com.habitrpg.android.habitica.ui.viewmodels;

import ad.k0;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.models.inventory.Egg;
import com.habitrpg.android.habitica.models.inventory.Item;
import dc.n;
import dc.w;
import dd.g;
import dd.i;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainActivityViewModel.kt */
@f(c = "com.habitrpg.android.habitica.ui.viewmodels.MainActivityViewModel$getToolbarTitle$1", f = "MainActivityViewModel.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class MainActivityViewModel$getToolbarTitle$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $eggType;
    final /* synthetic */ int $id;
    final /* synthetic */ pc.l<CharSequence, w> $onSuccess;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainActivityViewModel$getToolbarTitle$1(MainActivityViewModel mainActivityViewModel, String str, pc.l<? super CharSequence, w> lVar, int i10, Continuation<? super MainActivityViewModel$getToolbarTitle$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivityViewModel;
        this.$eggType = str;
        this.$onSuccess = lVar;
        this.$id = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new MainActivityViewModel$getToolbarTitle$1(this.this$0, this.$eggType, this.$onSuccess, this.$id, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((MainActivityViewModel$getToolbarTitle$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Egg egg;
        Egg egg2;
        d10 = d.d();
        int i10 = this.label;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
            String str = this.$eggType;
            if (str == null) {
                str = "";
            }
            g<Item> item = inventoryRepository.getItem("egg", str);
            this.label = 1;
            obj = i.x(item, this);
            if (obj == d10) {
                return d10;
            }
        }
        Item item2 = (Item) obj;
        if (item2 == null || !ac.a.b(item2)) {
            z10 = false;
        }
        if (!z10) {
            return w.f13270a;
        }
        pc.l<CharSequence, w> lVar = this.$onSuccess;
        String str2 = null;
        if (this.$id == R.id.petDetailRecyclerFragment) {
            if (item2 instanceof Egg) {
                egg2 = (Egg) item2;
            } else {
                egg2 = null;
            }
            if (egg2 != null) {
                str2 = egg2.getText();
            }
        } else {
            if (item2 instanceof Egg) {
                egg = (Egg) item2;
            } else {
                egg = null;
            }
            if (egg != null) {
                str2 = egg.getMountText();
            }
        }
        lVar.invoke(str2);
        return w.f13270a;
    }
}
