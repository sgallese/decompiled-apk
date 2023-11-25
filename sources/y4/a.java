package y4;

import b5.l;
import java.io.File;

/* compiled from: FileKeyer.kt */
/* loaded from: classes.dex */
public final class a implements b<File> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26275a;

    public a(boolean z10) {
        this.f26275a = z10;
    }

    @Override // y4.b
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public String a(File file, l lVar) {
        if (this.f26275a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
