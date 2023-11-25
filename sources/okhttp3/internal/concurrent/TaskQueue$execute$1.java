package okhttp3.internal.concurrent;

import dc.w;
import pc.a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes4.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ a<w> $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z10, a<w> aVar) {
        super(str, z10);
        this.$name = str;
        this.$cancelable = z10;
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
