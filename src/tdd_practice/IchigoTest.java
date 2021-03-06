package tdd_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class IchigoTest {

	private Ichigo ichigo;

	// 課題１
	@Nested
	class 対象の品種と対象のサイズを与えていちごを作り_文字列表現を取得出来ること {
		@Test
		void 品種あまおうとサイズSのいちごを作成し_文字列表現を取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("あまおう", "S");
			// 実行、検証
			assertEquals("あまおう: S", ichigo.getIchigoToString());
		}
		@Test
		void 品種とちおとめとサイズMのいちごを作成し_文字列表現を取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("とちおとめ", "M");
			// 実行、検証
			assertEquals("とちおとめ: M", ichigo.getIchigoToString());
		}
		@Test
		void 品種もういっことサイズLのいちごを作成し_文字列表現を取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("もういっこ", "L");
			// 実行、検証
			assertEquals("もういっこ: L", ichigo.getIchigoToString());
		}
		@Test
		void 品種もういっことサイズLLのいちごを作成し_文字列表現を取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("もういっこ", "LL");
			// 実行、検証
			assertEquals("もういっこ: LL", ichigo.getIchigoToString());
		}
	}
	// 課題１
	@Nested
	class 対象の品種と対象外のサイズを与えていちごを作ろうとしエラーとなる {
		@Test
		void 品種あまおう_サイズXLを与えるとエラーとなる() throws Exception {
			assertThrows(IllegalArgumentException.class, () -> new Ichigo("あまおう", "XL"));
		}
	}
	@Nested
	class 対象外の品種と対象のサイズを与えていちごを作ろうとしエラーとなる {
		@Test
		void 品種たいしょうがい_サイズＳを与えるとエラーとなる() throws Exception {
			assertThrows(IllegalArgumentException.class, () -> new Ichigo("たいしょうがい", "S"));
		}
	}
	@Nested
	class 対象外の品種と対象外のサイズを与えていちごを作ろうとしエラーとなる {
		@Test
		void 品種たいしょうがい_サイズＳを与えるとエラーとなる() throws Exception {
			assertThrows(IllegalArgumentException.class, () -> new Ichigo("たいしょうがい", "XL"));
		}
	}
	// 課題２
	@Nested
	class 対象の品種と対象の重さを与えていちごを作り_正しいサイズを取得出来ること {
		@Test
		void 品種あまおうと重さ1kgのいちごを作成し_サイズSを取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("あまおう", 1);
			// 実行、検証
			assertEquals("S", ichigo.getSize());
		}
		@Test
		void 品種あまおうと重さ10kgのいちごを作成し_サイズMを取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("あまおう", 10);
			// 実行、検証
			assertEquals("M", ichigo.getSize());
		}
		@Test
		void 品種あまおうと重さ20kgのいちごを作成し_サイズLを取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("あまおう", 20);
			// 実行、検証
			assertEquals("L", ichigo.getSize());
		}
		@Test
		void 品種あまおうと重さ25kgのいちごを作成し_サイズLLを取得出来ること() throws Exception {
			// 準備
			ichigo = new Ichigo("あまおう", 25);
			// 実行、検証
			assertEquals("LL", ichigo.getSize());
		}
	}

}
