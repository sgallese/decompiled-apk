package w2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: v  reason: collision with root package name */
    private int f25355v;

    /* renamed from: w  reason: collision with root package name */
    private int f25356w;

    /* renamed from: x  reason: collision with root package name */
    private LayoutInflater f25357x;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f25356w = i10;
        this.f25355v = i10;
        this.f25357x = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // w2.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f25357x.inflate(this.f25356w, viewGroup, false);
    }

    @Override // w2.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f25357x.inflate(this.f25355v, viewGroup, false);
    }
}
