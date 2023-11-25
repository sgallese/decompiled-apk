package com.habitrpg.android.habitica.ui.viewHolders.tasks;

import ad.k0;
import android.widget.Button;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: BaseTaskViewHolder.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.viewHolders.tasks.BaseTaskViewHolder$6$ellipsisStateChanged$1", f = "BaseTaskViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseTaskViewHolder$6$ellipsisStateChanged$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ boolean $ellipses;
    int label;
    final /* synthetic */ BaseTaskViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTaskViewHolder$6$ellipsisStateChanged$1(boolean z10, BaseTaskViewHolder baseTaskViewHolder, Continuation<? super BaseTaskViewHolder$6$ellipsisStateChanged$1> continuation) {
        super(2, continuation);
        this.$ellipses = z10;
        this.this$0 = baseTaskViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BaseTaskViewHolder$6$ellipsisStateChanged$1(this.$ellipses, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BaseTaskViewHolder$6$ellipsisStateChanged$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Button button;
        int i10;
        boolean z10;
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            if (this.$ellipses && this.this$0.getNotesTextView().getMaxLines() != 3) {
                this.this$0.getNotesTextView().setMaxLines(3);
            }
            button = this.this$0.expandNotesButton;
            if (button != null) {
                if (!this.$ellipses) {
                    z10 = this.this$0.notesExpanded;
                    if (!z10) {
                        i10 = 8;
                        button.setVisibility(i10);
                    }
                }
                i10 = 0;
                button.setVisibility(i10);
            }
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
