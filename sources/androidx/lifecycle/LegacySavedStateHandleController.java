package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.p;
import androidx.savedstate.a;
import java.util.Iterator;

/* compiled from: LegacySavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f4857a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0162a {
        @Override // androidx.savedstate.a.InterfaceC0162a
        public void a(w3.d dVar) {
            qc.q.i(dVar, "owner");
            if (dVar instanceof c1) {
                b1 viewModelStore = ((c1) dVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
                Iterator<String> it = viewModelStore.c().iterator();
                while (it.hasNext()) {
                    v0 b10 = viewModelStore.b(it.next());
                    qc.q.f(b10);
                    LegacySavedStateHandleController.a(b10, savedStateRegistry, dVar.getLifecycle());
                }
                if ((!viewModelStore.c().isEmpty()) != false) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(v0 v0Var, androidx.savedstate.a aVar, p pVar) {
        qc.q.i(v0Var, "viewModel");
        qc.q.i(aVar, "registry");
        qc.q.i(pVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) v0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.e()) {
            savedStateHandleController.a(aVar, pVar);
            f4857a.c(aVar, pVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, p pVar, String str, Bundle bundle) {
        qc.q.i(aVar, "registry");
        qc.q.i(pVar, "lifecycle");
        qc.q.f(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, n0.f5016f.a(aVar.b(str), bundle));
        savedStateHandleController.a(aVar, pVar);
        f4857a.c(aVar, pVar);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final p pVar) {
        p.b b10 = pVar.b();
        if (b10 != p.b.INITIALIZED && !b10.isAtLeast(p.b.STARTED)) {
            pVar.a(new s() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.s
                public void c(v vVar, p.a aVar2) {
                    qc.q.i(vVar, "source");
                    qc.q.i(aVar2, "event");
                    if (aVar2 == p.a.ON_START) {
                        p.this.d(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        } else {
            aVar.i(a.class);
        }
    }
}
