package okhttp3.internal.concurrent;

import pc.a;

/* compiled from: TaskQueue.kt */
/* loaded from: classes4.dex */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ a<Long> $block;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, a<Long> aVar) {
        super(str, false, 2, null);
        this.$name = str;
        this.$block = aVar;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return this.$block.invoke().longValue();
    }
}
