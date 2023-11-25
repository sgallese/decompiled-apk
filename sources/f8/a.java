package f8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Ints.java */
/* loaded from: classes3.dex */
public final class a extends b {
    public static int a(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return (int) j10;
    }
}
