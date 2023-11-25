package r1;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* renamed from: id  reason: collision with root package name */
    private final int f22061id;
    private final int order;

    /* compiled from: TextActionModeCallback.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22062a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f22062a = iArr;
        }
    }

    b(int i10) {
        this.f22061id = i10;
        this.order = i10;
    }

    public final int getId() {
        return this.f22061id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i10 = a.f22062a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 17039373;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 17039363;
            }
            return 17039371;
        }
        return 17039361;
    }
}
