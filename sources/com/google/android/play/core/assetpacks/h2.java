package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class h2 {

    /* renamed from: b  reason: collision with root package name */
    private static final x7.f f10834b = new x7.f("MergeSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    private final d0 f10835a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(d0 d0Var) {
        this.f10835a = d0Var;
    }

    private static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new c1("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            throw new c1("Unable to move file: ".concat(String.valueOf(file)));
        } else {
            throw new c1("File clashing with existing file from other slice: ".concat(file2.toString()));
        }
    }

    public final void a(g2 g2Var) {
        File D = this.f10835a.D(g2Var.f11086b, g2Var.f10821c, g2Var.f10822d, g2Var.f10823e);
        if (D.exists()) {
            File w10 = this.f10835a.w(g2Var.f11086b, g2Var.f10821c, g2Var.f10822d);
            if (!w10.exists()) {
                w10.mkdirs();
            }
            b(D, w10);
            try {
                this.f10835a.a(g2Var.f11086b, g2Var.f10821c, g2Var.f10822d, this.f10835a.q(g2Var.f11086b, g2Var.f10821c, g2Var.f10822d) + 1);
                return;
            } catch (IOException e10) {
                f10834b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new c1("Writing merge checkpoint failed.", e10, g2Var.f11085a);
            }
        }
        throw new c1(String.format("Cannot find verified files for slice %s.", g2Var.f10823e), g2Var.f11085a);
    }
}
