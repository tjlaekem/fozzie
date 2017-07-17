package fozzie.commands;

public class RefCommandBuilder extends CommandBuilder {

	private static RefCommandBuilder instance;

	public static CommandBuilder getInstance() {
		if (instance == null)
			instance = new RefCommandBuilder();
		return instance;
	}

	private RefCommandBuilder() {/* prevent instantiation */}

	@Override
	protected String makeValid(int sequenceNumber) {
		return String.format(
			"AT*REF=%d,%d<CR>",
			sequenceNumber,
			getValidFlag()
		);
	}

	@Override
	protected String makeInvalid(int sequenceNumber) {
		/* not yet implemented */
		return makeValid(sequenceNumber);
	}

	private int getValidFlag() {
		return 0;
	}
}