package mission;

public interface Meter {
// Meter(�ý� ���ͱ�)�������̽��� start�� stop�̶��
// �߻�޼ҵ带 ������ �ֽ��ϴ�.
	public abstract void start();
	public abstract int stop(int distance);
}
